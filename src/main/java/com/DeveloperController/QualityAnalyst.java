package com.DeveloperController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QualityAnalyst {
  
	@RequestMapping("/QAupdate")
	public String qaUpdate(Model model) {
		String qaName="Niranjan";
		String progress="Testing is under Progress";
		model.addAttribute("qaName", qaName);
		model.addAttribute("progress", progress);
		return "QAupdate";
	}
}
