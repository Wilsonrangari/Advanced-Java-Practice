package com.wilson.client;

import com.wilson.dao.StudentDao;
import com.wilson.dao.StudentDaoImpl;
import com.wilson.entity.StudentCompositeKey;
import com.wilson.entity.StudentEntity;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDao dao = new StudentDaoImpl(); 
		
		StudentEntity student = new StudentEntity();
		
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		
		compositeKey.setRollNumber(102);
		compositeKey.setSection("B");
		
		student.setCompositeKey(compositeKey);
		student.setMarks(280);
		student.setStudentName("Ruchira");
		
		//dao.saveStudent(student);
		
		StudentEntity fetchStudent = dao.fetchStudent(compositeKey);
		System.out.println(fetchStudent);

	}

}
