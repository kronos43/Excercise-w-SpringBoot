package com.waynebennet.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.waynebennet.roomwebapp.models.StaffMember;

@Service
public class StaffService {
	private static final List<StaffMember> staff = new ArrayList<>();
	static {
		staff.add(new StaffMember(1,"Wayne","Bennet"));
		staff.add(new StaffMember(2,"Joshua","Renold"));
		
	}
	public  List<StaffMember> getAllStaff() {return staff;}
}
