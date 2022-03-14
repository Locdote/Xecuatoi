package com.xecuatoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xecuatoi.entity.ThuNghiemEntity;
import com.xecuatoi.service.ThuNghiemService;

@Controller
public class ThuNghiemController {

	@Autowired
	public ThuNghiemService thuNghiemService;
	
	@GetMapping("/thunghiem")
	public String thunghiem(Model model) {
		
		model.addAttribute("menu", thuNghiemService.getAll()  );
		return "thunghiem.html";
		
	}
}
