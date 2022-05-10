package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
@Transactional
public class SearchUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findUserList(Integer userId, String name, LocalDate birthday, String telephone){
		List<User> userList = userRepository.findUserList(userId, name, birthday, telephone);
		
		if(userList.size() == 0) {
			return null;
		}
		
		return userList;
	}

}
