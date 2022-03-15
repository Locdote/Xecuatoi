package com.xecuatoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xecuatoi.entity.XecuatoiEntity;
import com.xecuatoi.service.XecuatoiService;

@Controller
public class XecutoiController {

	@Autowired
	public XecuatoiService xeCuatoiService;
	
	@GetMapping("/xecuatoi")
	public String xecuatoi(Model model) {
		
		model.addAttribute("menu", xeCuatoiService.getAll()  );
		return "xecuatoi.html";
		
	}
}
