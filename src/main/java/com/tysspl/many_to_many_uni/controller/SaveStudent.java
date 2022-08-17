package com.tysspl.many_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.many_to_many_uni.dto.Course;
import com.tysspl.many_to_many_uni.dto.Student;

public class SaveStudent {

	public static void main(String[] args) {

		List<Student> ls1 = new ArrayList<Student>();
		List<Student> ls2 = new ArrayList<Student>();
		List<Student> ls3 = new ArrayList<Student>();

		Student studen1 = new Student();
		studen1.setName("Pincky");
		studen1.setAge(25);

		Student studen2 = new Student();
		studen2.setName("Rahul");
		studen2.setAge(23);

		Student studen3 = new Student();
		studen3.setName("Tommy");
		studen3.setAge(21);

		Student studen4 = new Student();
		studen4.setName("Vijay");
		studen4.setAge(23);

		ls1.add(studen1);
		ls1.add(studen2);
		ls2.add(studen3);
		ls3.add(studen3);
		ls3.add(studen1);

		Course course1 = new Course();
		course1.setCourseName("Devops");
		course1.setCost(38999);
		course1.setSl(ls1);

		Course course2 = new Course();
		course2.setCourseName("Python Full Stack");
		course2.setCost(38999);
		course2.setSl(ls2);

		Course course3 = new Course();
		course3.setCourseName("Java Full Stack");
		course3.setCost(34999);
		course3.setSl(ls3);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(studen1);
		entityManager.persist(studen2);
		entityManager.persist(studen3);
		entityManager.persist(studen4);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
		System.err.println("----------------------------Done------------------------------");

	}

}
