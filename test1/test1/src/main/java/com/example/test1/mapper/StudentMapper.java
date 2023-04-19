package com.example.test1.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test1.model.Student;

@Mapper		
public interface StudentMapper {
	
	// 조회
	List<Student> selectStudentList(HashMap<String, Object> map) throws Exception; 
	
	//학생 상세 조회 (1명)
	Student selectStudentInfo(HashMap<String, Object> map) throws Exception; 
								// { stuNo : "20153075 }
	
}
