package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("hello")
	public @ResponseBody String hello(@RequestParam String name) {
		return "Hello! " + name;
	}
	
}
