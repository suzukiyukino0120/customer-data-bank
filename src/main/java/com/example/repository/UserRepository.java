package com.example.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.User;

@Mapper
public interface UserRepository {
	
	List<User> findUserList(@Param("userId") Integer userId, 
						@Param("name") String name, 
						@Param("birthday") LocalDate birthday,
						@Param("telephone") String telephone);
	
	User findUserById(Integer userId);

}
