package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Staff;

@Mapper
public interface StaffRepository {

	Staff findByIdAndPassword(@Param("staffId") Integer staffId, @Param("password") String password);
}
