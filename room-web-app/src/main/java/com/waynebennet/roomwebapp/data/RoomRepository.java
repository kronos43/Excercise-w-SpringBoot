package com.waynebennet.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waynebennet.roomwebapp.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
	
}
