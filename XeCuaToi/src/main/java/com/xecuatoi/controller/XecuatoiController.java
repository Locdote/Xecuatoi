package com.xecuatoi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xecuatoi.entity.XecuatoiEntity;
import com.xecuatoi.service.XecuatoiService;

@Controller
public class XecuatoiController {
	
	@Autowired
	private XecuatoiService xecuatoiService;
	
	public XecuatoiController() {
		
	}
	@GetMapping("/xecuatoi")
	public String xecuatoi(Model model) {
		
		List<XecuatoiEntity> danhSachMauXe = xecuatoiService.getAll();
		
		model.addAttribute("danhSachMauXe", danhSachMauXe);
		return "xecuatoi.html";
		
	}

}
