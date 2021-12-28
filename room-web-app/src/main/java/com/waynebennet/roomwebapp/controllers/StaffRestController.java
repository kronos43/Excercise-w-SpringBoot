package com.waynebennet.roomwebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waynebennet.roomwebapp.models.StaffMember;
import com.waynebennet.roomwebapp.services.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
	private StaffService _staffService;
	
	@Autowired
	public StaffRestController(StaffService staffService) {
		this._staffService = staffService;
	}
	
	@GetMapping("/getAllStaff")
		public List<StaffMember> getAllStaff() {
		return _staffService.getAllStaff();
		}
	}

