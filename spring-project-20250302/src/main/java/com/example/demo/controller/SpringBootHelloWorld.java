package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080
//@RestController
@Controller
//@RequestMapping(value = "/users")

//http://localhost:8080/qq/index
@RequestMapping("/qq")
//@RequestMapping(value = "/qq", method = RequestMethod.GET)
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@RequestMapping("/")
//	public String hello(){
//		return "Hey, Spring Boot 的 Hello World ! ";
//	}

	@GetMapping("/x")
	public String hello(){
		return "Hey, Spring Boot 的 Hello World !";
	}
	
	@GetMapping("/index")
	public String helloIndex(){
		return "index";
	}
	
}
