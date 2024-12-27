package com.cjc.main.repositiries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;



public interface HomeRepositories extends CrudRepository<Student, Integer>
{

	public Student findAllByUnameAndPassword(String un,String ps);
	public Student findAllByUid(int uid);
}
