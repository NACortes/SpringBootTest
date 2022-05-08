package com.example.demo.validation;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationTestClass {
	
	
	@Email(message="The email should be a valid format")
	private String email;
	
	@Min(value=18, message="The age must be 18 years old or older")
	private Integer age;
	
	@NotBlank(message="The name must not be blank")
	private String name;
	
	@Past(message="The registration date must be less than today")
	private LocalDate registrationDate;
	
	

}
