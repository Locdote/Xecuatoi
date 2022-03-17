package com.xecuatoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quantri")
public class QuantriController {

	@GetMapping("/dangnhap")
	public String login() {
		return "dangnhap.html";
	}
	
	@GetMapping()
	public String home() {
		return "quantri.html";
	}
}
