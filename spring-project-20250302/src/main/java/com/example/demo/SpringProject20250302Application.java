package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.example.demo.model","com.example.demo.controller","com.example.demo.service","com.example.demo.repository"})
//@EntityScan({"com.example.demo","com.example.demo.model","com.example.demo.controller","com.example.demo.service","com.example.demo.repository"})
public class SpringProject20250302Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringProject20250302Application.class, args);
	}

}
