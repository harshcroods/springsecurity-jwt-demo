package com.croods.springsecurity.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {

	@NotBlank(message = "Username is required.")
	private String username;

	@NotBlank(message = "Password is required.")
	private String password;
}
