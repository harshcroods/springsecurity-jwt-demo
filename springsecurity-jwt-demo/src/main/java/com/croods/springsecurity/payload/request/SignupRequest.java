package com.croods.springsecurity.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignupRequest {

	@NotBlank(message = "Username is required.")
	@Size(min = 3, max = 20, message = "Username must be between 3 to 20 characters.")
	private String username;

	@NotBlank(message = "Password is required.")
	@Size(min = 6, max = 40, message = "Password must be between 6 to 40 characters.")
	private String password;

	@NotBlank(message = "Email is required.")
	@Size(max = 50)
	@Email(message = "Email must be proper.")
	private String email;

	private Set<String> role;
   
}
