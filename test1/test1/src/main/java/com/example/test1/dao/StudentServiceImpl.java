package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.StudentMapper;
import com.example.test1.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> searchStudentList(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentList(map);
	}

	@Override
	public Student searchStudentInfo(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		Student info = studentMapper.selectStudentInfo(map);
		return info;
	}

	
	
}
