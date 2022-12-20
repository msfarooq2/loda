package com.loda.brd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LoginController {

	@GetMapping("login")
	public String Login() {
		return "Login Requires a Username and Password";
	}
}
