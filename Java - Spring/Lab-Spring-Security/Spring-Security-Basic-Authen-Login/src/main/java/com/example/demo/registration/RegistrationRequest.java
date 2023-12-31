package com.example.demo.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //this annotation is not working
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String password;
	
	
}
