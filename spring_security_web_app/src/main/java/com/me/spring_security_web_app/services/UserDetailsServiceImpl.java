package com.me.spring_security_web_app.services;

import java.util.Optional;

import com.me.spring_security_web_app.entities.User;
import com.me.spring_security_web_app.entities.UserDetailsImpl;
import com.me.spring_security_web_app.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository uRepository;

    @Override
    public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {

        Optional<User> opUser = uRepository.findByEmail(arg0);

        if (opUser.isPresent()) {
            return new UserDetailsImpl(opUser.get());
        } else {
            throw new UsernameNotFoundException("Khong tim thay user voi dia chi email: " + arg0);
        }

    }

}
