package com.webgame.auth.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * spring security
 *
 * @author cdw
 * @date 2021-03-29
 */
@Service
@RequiredArgsConstructor
public class WebGameUserDetailServiceImpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

//    private final
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
