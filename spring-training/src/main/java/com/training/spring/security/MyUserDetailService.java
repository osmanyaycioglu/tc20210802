package com.training.spring.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private IUserObjDao ud;

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        Optional<UserObj> userLoc = this.ud.findById(usernameParam);
        UserObj userFromDbLoc = userLoc.orElseGet(null);
        if (userFromDbLoc == null) {
            throw new UsernameNotFoundException("User yok");
        }
        BCryptPasswordEncoder encoderLoc = new BCryptPasswordEncoder();
        return User.builder()
                   .password(encoderLoc.encode(userFromDbLoc.getPassword()))
                   .username(usernameParam)
                   .roles(userFromDbLoc.getRole())
                   .build();
    }

}
