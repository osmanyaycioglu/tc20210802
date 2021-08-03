package com.training.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.training.spring.Hello;
import com.training.spring.HelloEsp;
import com.training.spring.HelloTr;
import com.training.spring.IHello;

@Configuration
public class MyConfig {

    @Autowired
    private Environment  env;

    @Value("${hello.language}")
    private int          languageIndex;

    @Autowired
    private MyConfigProp mcp;

    @Value("#{myConfigProp.helloLanguage}")
    private int          indexLang;

    @Bean
    @Qualifier("DYN")
    public IHello createHello() {
        System.out.println(this.mcp);
        switch (this.mcp.getLanguage()
                        .getIndex()) {
            case 0:
                return new Hello();
            case 1:
                return new HelloTr();
            case 2:
                return new HelloEsp();
            default:
                return new Hello();
        }
    }

    //    @Bean
    //    @Qualifier("DYN")
    //    public IHello createHello() {
    //        switch (this.languageIndex) {
    //            case 0:
    //                return new Hello();
    //            case 1:
    //                return new HelloTr();
    //            case 2:
    //                return new HelloEsp();
    //            default:
    //                return new Hello();
    //        }
    //    }

    //    @Bean
    //    @Qualifier("DYN")
    //    public IHello createHello() {
    //        String propertyLoc = this.env.getProperty("hello.language");
    //        int indexLoc = Integer.parseInt(propertyLoc);
    //        switch (indexLoc) {
    //            case 0:
    //                return new Hello();
    //            case 1:
    //                return new HelloTr();
    //            case 2:
    //                return new HelloEsp();
    //            default:
    //                return new Hello();
    //        }
    //    }

    //    @Bean
    //    @Qualifier("DYN")
    //    public IHello createHello() {
    //        Random randomLoc = new Random();
    //        int nextIntLoc = randomLoc.nextInt(3);
    //        switch (nextIntLoc) {
    //            case 0:
    //                return new Hello();
    //            case 1:
    //                return new HelloTr();
    //            case 2:
    //                return new HelloEsp();
    //            default:
    //                return new Hello();
    //        }
    //    }

}
