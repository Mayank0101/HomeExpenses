package com.homeexpense.controller;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensesController {

	public static void main(String[] args) {
		SpringApplication.run(ExpensesController.class, args);
	}
	
	@GetMapping("/getExpenses/{startDate}/and/{endDate}")
	public List<String> getExpenses(@PathVariable String studentId) {
		return null;
	}
	
	@GetMapping("/addExpenses/{startDate}/and/{endDate}")
	public boolean addExpenses(@PathVariable String studentId) {
		return false;
	}
	@GetMapping("/removeExpenses")
	public boolean removeExpenses(@PathVariable String studentId) {
		return false;
	}
	@GetMapping("/updateExpenses/{startDate}/and/{endDate}")
	public boolean updateExpenses(@PathVariable String studentId) {
		return false;
	}
	
}
