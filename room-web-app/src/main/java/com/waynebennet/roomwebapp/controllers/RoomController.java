package com.waynebennet.roomwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waynebennet.roomwebapp.services.RoomService;

@RestController
@RequestMapping("rooms")
public class RoomController {
	
	private RoomService _roomService;
	
	@Autowired
	public RoomController(RoomService roomService) {
		this._roomService = roomService;
	}
	
	@GetMapping("/getAllRooms")
	public String getAllRooms(Model model) {
		model.addAttribute("rooms",_roomService.getAllRooms());
		return "rooms";
	}
}
