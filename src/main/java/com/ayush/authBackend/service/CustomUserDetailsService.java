package com.ayush.authBackend.service;

import com.ayush.authBackend.entity.User;
import com.ayush.authBackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        Optional<User> userOpt = userRepository.findByEmail(login);
        if (userOpt.isEmpty()) {

            userOpt = userRepository.findByUsername(login);
        }

        User user = userOpt.orElseThrow(() ->
                new UsernameNotFoundException("User not found with login: " + login));


        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .authorities("USER")
                .build();
    }
}