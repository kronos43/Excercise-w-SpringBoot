package com.waynebennet.roomwebapp.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.waynebennet.roomwebapp.data.RoomRepository;
import com.waynebennet.roomwebapp.models.Room;


@Service
public class RoomService {
	private final RoomRepository roomRepository;
	
	public RoomService(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}

	public  List<Room> getAllRooms() {
		return roomRepository.findAll();
	}
	
}
