package com.xecuatoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xecuatoi.entity.XecuatoiEntity;
import com.xecuatoi.service.XecuatoiService;

@Controller
//@RequestMapping("/xecuatoi")
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
	public String trangchu(Model model) {
		
		model.addAttribute("contenthtml", "tintuc.html"  );
		model.addAttribute("menu", xeCuatoiService.getAll()  );
		return "xecuatoi.html";
	}
	@GetMapping("/cacmauxe")
	public String cacmauxe(Model model) {
		
		model.addAttribute("contenthtml", "cacmauxe.html"  );
		model.addAttribute("menu", xeCuatoiService.getAll()  );
		return "xecuatoi.html";
	}
	
}
