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
		
		model.addAttribute("contenthtml", "trangchu.html"  );
		model.addAttribute("menu", xeCuatoiService.getAll()  );
		return "xecuatoi.html";
		
	}
	
	@GetMapping("/tintuc")
	public String tintuc(Model model) {
		
		model.addAttribute("contenthtml", "tintuc.html");
		model.addAttribute("tenTrang", "Tin tức");
		model.addAttribute("menu", xeCuatoiService.getAll());
		return "xecuatoi.html";
	}
	
	@GetMapping("/lienhe")
	public String lienhe(Model model) {
		
		model.addAttribute("contenthtml", "lienhe.html");
		model.addAttribute("tenTrang", "Liên hệ");
		model.addAttribute("menu", xeCuatoiService.getAll());
		return "xecuatoi.html";
	}
}
