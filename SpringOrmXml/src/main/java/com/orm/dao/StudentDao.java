package com.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.orm.entiry.Student;


public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	// create data
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer) this.hibernateTemplate.save(student);		
		return i;		
	}
	// get single data or read data (select)
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;		
	}
	
	// get multiple data read data(select)
	public List<Student> getAllStudent()
	{
	List<Student> students =	this.hibernateTemplate.loadAll(Student.class);
		
		return students;		
	}
	
	// delete data
	@Transactional
	public void deleteStudent(int id)
	{
		// pahle data get kare then delete kare
		Student student = this.hibernateTemplate.get(Student.class,id);
		this.hibernateTemplate.delete(student);
		
	}
	
	// update data
	@Transactional
	public Student updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
		return student;
		
	}
	

	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	

}
