package com.waynebennet.roomwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waynebennet.roomwebapp.services.StaffService;
@RestController
@RequestMapping("staff")
public class StaffController {
	
	private StaffService _staffService;
		
	@Autowired
	public StaffController(StaffService staffService) {
		this._staffService = staffService;
	}
	
	@GetMapping("/getAllStaff")
		public String getAllStaff(Model model) {
		model.addAttribute("staff",_staffService.getAllStaff());
		return "staff";
		}
	}

