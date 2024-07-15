package com.wilson.dao;

import com.wilson.entity.StudentCompositeKey;
import com.wilson.entity.StudentEntity;

public interface StudentDao {
	
	void saveStudent(StudentEntity entity);
	
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
