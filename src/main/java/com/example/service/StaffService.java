package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Staff;
import com.example.repository.StaffRepository;

@Service
@Transactional
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;
	
//	public boolean loginCheck(Integer staffId, String password) {
//		if(staffRepository.findByIdAndPassword(staffId, password) == null) {
//			return false;
//		}else {
//			return true;
//		}
//	}
	
	public Staff findStaffByIdAndPassword(Integer staffId, String password) {
		return staffRepository.findByIdAndPassword(staffId, password);
	}

}
