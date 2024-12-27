package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;
import com.cjc.main.repositiries.HomeRepositories;
import com.cjc.main.service.HomeService;
@Repository
public class HomeServiceImpl implements HomeService{

	
	@Autowired
	HomeRepositories hr;
	@Override
	public void saveData(Student s) 
	{
		hr.save(s);
		
	}
	@Override
	public Student loginCheck(String un, String ps) {
		// TODO Auto-generated method stub
		return hr.findAllByUnameAndPassword(un, ps);
	}
	@Override
	public Iterable<Student> getAll() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}
	@Override
	public void deleteData(int uid) {
		// TODO Auto-generated method stub
		hr.deleteById(uid);
	}
	@Override
	public Student editPage(int uid) 
	{
		
		return hr.findAllByUid(uid);
	}

	
	

}
