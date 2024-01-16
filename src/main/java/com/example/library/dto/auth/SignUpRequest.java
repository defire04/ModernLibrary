package com.example.library.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Schema(description = "Registration Request")
@Builder
public class SignUpRequest {

    @Schema(description = "Username", example = "Jon")
    @Size(min = 2, max = 50, message = "Username must be between 5 and 50 characters")
    @NotBlank(message = "Username cannot be blank")
    private String username;


    @Schema(description = "Password", example = "my_1secret1_password")
    @Size(max = 255, message = "Password length should not exceed 255 characters")
    private String password;
}