package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entites.UserDetailRequestModel;
import com.example.demo.MyServices.IUserService;
import com.example.demo.Response.UserRest;

@RestController
public class UserController {
	
	
	@Autowired
	IUserService userService;
	
	
	@GetMapping("/get")
	public String userGet() {
		return "My name is shubham i will hack your computer";
	}
	
	
	@PostMapping("/update")
	public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {
		
		UserRest returnedValue = new UserRest();
		
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(returnedValue, dto);
		
		UserDto createdUser = userService.createUser(dto);
		BeanUtils.copyProperties(createdUser, returnedValue);

		return returnedValue;
		
	}
}
