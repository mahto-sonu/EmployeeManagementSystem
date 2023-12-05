package com.employee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.demo.entity.Employee;

@Controller
public class EmpController {
	
	@GetMapping("/")
	public String home() {
		System.out.println("Inside Home:::");
		return "index";
	}
	
	@GetMapping("/addEmp")
	public String addEmployee() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee emp) {
		System.out.println(emp);
		return "index";
	}
	
}
