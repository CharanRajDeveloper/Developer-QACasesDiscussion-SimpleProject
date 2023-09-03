package com.DeveloperController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Developer {
	//@ResponseBody
   @RequestMapping("/Java")
	public String display(Model model) {
	   String devName="Charan Raj";
	   String caseId="P1-27";
	   String caseDescription="Development completed,please proceed with the testing";
	   String assignee="QA.services";
	   model.addAttribute("DeveloperName", devName);
	   model.addAttribute("caseId", caseId);
	   model.addAttribute("caseDescription", caseDescription);
	   model.addAttribute("assignee", assignee);
		return "Quality-analyst";
	}

}
