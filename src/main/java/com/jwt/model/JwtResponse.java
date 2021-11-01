package com.jwt.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4250981108920233561L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}