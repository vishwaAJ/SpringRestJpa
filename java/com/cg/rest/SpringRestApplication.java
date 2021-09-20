package com.cg.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringRestApplication {
	

	public static void main(String[] args) {

	SpringApplication.run(SpringRestApplication.class, args);
	
	System.out.println("Server started at port :" +8083);

}
}