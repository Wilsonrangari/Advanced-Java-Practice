package com.wilson.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wilson.entity.StudentCompositeKey;
import com.wilson.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test"); 

	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(entity);
			transaction.commit();
			System.out.println("Student object is persisted");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Datahas not been saved");
		}
		finally {
			entityManager.close();
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
		 StudentEntity studentEntity = entityManager.find(StudentEntity.class, compositeKey);

		return studentEntity;
	}

}
