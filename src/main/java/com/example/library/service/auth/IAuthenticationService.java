package com.example.library.service.auth;

import com.example.library.dto.auth.JwtAuthenticationResponse;
import com.example.library.dto.auth.SignInRequest;
import com.example.library.dto.auth.SignUpRequest;

public interface IAuthenticationService {

    /**
     * Sign up a new user with the provided request details.
     *
     * @param request the sign-up request containing username and password
     * @return a JWT authentication response containing the generated token
     */
    JwtAuthenticationResponse signUp(SignUpRequest request);

    /**
     * Sign in an existing user with the provided request details.
     *
     * @param request the sign-in request containing username and password
     * @return a JWT authentication response containing the generated token
     */
    JwtAuthenticationResponse signIn(SignInRequest request);
}
