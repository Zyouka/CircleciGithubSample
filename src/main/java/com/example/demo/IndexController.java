package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@Autowired
	SystemDateMapper systemDateMapper;
	
	@RequestMapping
	public String index(Model model) {
		String systemDate = systemDateMapper.selectSystemDate();
		model.addAttribute("systemDate", systemDate);
		return "index";
	}
}
