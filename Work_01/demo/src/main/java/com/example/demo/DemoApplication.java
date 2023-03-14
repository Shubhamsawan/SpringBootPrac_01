package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
import org.springframework.web.client.RestTemplate;

import com.example.demo.controller.MyController;


@SpringBootApplication
@EnableSwagger2

//@Configuration
//@ComponentScan ({"Controller.MyController", "MyServices.CourseServiceImpl"})
@ComponentScan(basePackages = {"com.example"})
@ComponentScan(basePackageClasses = MyController.class)

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	

}
