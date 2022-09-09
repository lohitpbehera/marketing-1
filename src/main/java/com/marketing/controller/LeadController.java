package com.marketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		
		return "create_lead";
		
	}
	
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("leads")Lead lead,ModelMap model) {
		
	leadService.saveLead(lead);
		
	model.addAttribute("msg", "Lead is saved successfully");
		return "create_lead";
		
	}
	
	
}
