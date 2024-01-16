package com.example.library.service.auth;

import com.example.library.dto.auth.JwtAuthenticationResponse;
import com.example.library.dto.auth.SignInRequest;
import com.example.library.dto.auth.SignUpRequest;
import com.example.library.model.Role;
import com.example.library.model.User;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserService userService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @PostConstruct
    private void init() {
        String testPassword = "1234";

        User librarian = User.builder()
                .role(Role.ROLE_LIBRARIAN)
                .password(passwordEncoder.encode(testPassword))
                .username("Bob")
                .build();

        User admin = User.builder()
                .role(Role.ROLE_LIBRARIAN)
                .password(passwordEncoder.encode(testPassword))
                .username("ADMIN")
                .build();

        userService.create(librarian);
        userService.create(admin);

        String librarianToken = jwtService.generateToken(librarian);
        String adminToken = jwtService.generateToken(admin);

        System.out.println(librarianToken);
        System.out.println(adminToken);
    }


    public JwtAuthenticationResponse signUp(SignUpRequest request) {

        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ROLE_USER)
                .build();

        userService.create(user);

        String jwt = jwtService.generateToken(user);
        return new JwtAuthenticationResponse(jwt);
    }


    public JwtAuthenticationResponse signIn(SignInRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
        ));

        UserDetails userDetails = userService
                .userDetailsService()
                .loadUserByUsername(request.getUsername());

        String jwt = jwtService.generateToken(userDetails);
        return new JwtAuthenticationResponse(jwt);
    }
}