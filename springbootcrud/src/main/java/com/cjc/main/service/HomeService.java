package com.cjc.main.service;

import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
@Service
public interface HomeService {
	
	
public void saveData(Student s);
public Student loginCheck(String un,String ps);
public Iterable<Student> getAll();
public void deleteData(int uid);
public Student editPage(int uid);
}
