package com.training.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfigurator extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailService muds;

    @Bean
    public BCryptPasswordEncoder passEncrpt() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder authParam) throws Exception {
        authParam.userDetailsService(this.muds)
                 .passwordEncoder(this.passEncrpt());
    }

    @Override
    protected void configure(final HttpSecurity httpParam) throws Exception {
        httpParam.authorizeRequests()
                 .antMatchers("/actuator/**")
                 .permitAll()
                 .antMatchers("/first/**")
                 .hasAnyRole("VIEWER")
                 .antMatchers("/greet/**")
                 .hasAnyRole("ADMIN")
                 .anyRequest()
                 .authenticated()
                 .and()
                 .formLogin()
                 .disable()
                 .httpBasic();
    }

}
