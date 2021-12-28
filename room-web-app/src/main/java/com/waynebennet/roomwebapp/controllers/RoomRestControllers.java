package com.waynebennet.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waynebennet.roomwebapp.models.Room;
import com.waynebennet.roomwebapp.services.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestControllers {
	private RoomService _roomService;

	public RoomRestControllers(RoomService _roomService) {
		super();
		this._roomService = _roomService;
	}
	
	@GetMapping("/getAllRooms")
	public List<Room> getAllRooms() {
		return _roomService.getAllRooms();
	}
	
}
