package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StaffModel;
import com.example.demo.service.StaffService;

@RestController  //http://localhost:8080/addStaff
@RequestMapping("/rest") //http://localhost:8080/rest/addStaff
public class StaffController {
	
		@Autowired
		StaffModel staffModel;
		
		@Autowired
		StaffService staffService;
	    @RequestMapping("/addStaff")
	    public String hello(){
	    	staffModel = new StaffModel();
	    	staffModel.setPassword("1234");
	    	staffModel.setEmail("email@email.com");
	    	staffModel.setPhone("22334455");
	    	staffModel.setPosition("Manager");
	    	staffService.addStaff(staffModel);
	        return "New Staff added";
	    }
}
