package com.ayush.authBackend.service;

import com.ayush.authBackend.config.PasswordConfig;
import com.ayush.authBackend.dto.AuthResponse;
import com.ayush.authBackend.dto.LoginRequest;
import com.ayush.authBackend.dto.RegisterRequest;
import com.ayush.authBackend.entity.User;
import com.ayush.authBackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    //Register user
    public AuthResponse register(RegisterRequest request){

        if(userRepository.findByEmail(request.getEmail()).isPresent()){
            throw new RuntimeException("Email already taken");
        }
        if(userRepository.findByUsername(request.getUsername()).isPresent()){
            throw new RuntimeException("User already exists");
        }
        String encoderPassword=passwordEncoder.encode(request.getPassword());

        User user=User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(encoderPassword)
                .build();

        userRepository.save(user);

        String token = jwtService.generateToken(user);

        return new AuthResponse(token);
    }

    // Login User
    public AuthResponse login(LoginRequest request){

        Optional<User> userOpt=userRepository.findByEmail(request.getLogin());

        if(userOpt.isEmpty()){
            userOpt=userRepository.findByUsername(request.getLogin());
            if(userOpt.isEmpty()){
                throw new RuntimeException("User not found with email or username");
            }
        }

        User user=userOpt.get();

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())){
            throw new RuntimeException("Invalid password");
        }

        String token =jwtService.generateToken(user);
        return new AuthResponse(token);
    }

}
