package com.croods.springsecurity.payload.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtResponse {

	private String token;
	private Long id;
	private String username;
	private String email;
	private String type = "Bearer ";
	private List<String> roles;
	
	public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
}
