package com.mphasis.basic;

public class AgeValidator {

public void ageValidator(int age) throws Exception {
	if(age>=18) {
		System.out.println("u have right to vote");
		
	}
	else {
		throw new Exception("the age is <18 u have np right to vote");
		
		
	}
}
}
