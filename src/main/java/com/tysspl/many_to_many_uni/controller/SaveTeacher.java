
package com.tysspl.many_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.many_to_many_uni.dto.Subject;
import com.tysspl.many_to_many_uni.dto.Teacher;

public class SaveTeacher {

	public static void main(String[] args) {
		List<Subject> sl1 = new ArrayList<Subject>();
		List<Subject> sl2 = new ArrayList<Subject>();
		List<Subject> sl3 = new ArrayList<Subject>();

		Subject subject1 = new Subject();
		subject1.setName("English");
		subject1.setDays(50);

		Subject subject2 = new Subject();
		subject2.setName("Physics");
		subject2.setDays(65);

		Subject subject3 = new Subject();
		subject3.setName("Maths");
		subject3.setDays(80);

		Subject subject4 = new Subject();
		subject4.setName("CS");
		subject4.setDays(65);

		sl1.add(subject1);
		sl1.add(subject4);

		sl2.add(subject3);
		sl2.add(subject4);

		sl3.add(subject2);
		sl3.add(subject4);

		Teacher teacher1 = new Teacher();
		teacher1.setName("Nagendra");
		teacher1.setAge(38);
		teacher1.setPhoneNumber(7894561239l);
		teacher1.setSub(sl1);

		Teacher teacher2 = new Teacher();
		teacher2.setName("Radha");
		teacher2.setAge(26);
		teacher2.setPhoneNumber(1234567897l);
		teacher2.setSub(sl2);

		Teacher teacher3 = new Teacher();
		teacher3.setName("vinay");
		teacher3.setAge(46);
		teacher3.setPhoneNumber(147893254l);
		teacher3.setSub(sl2);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(subject4);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		entityTransaction.commit();
		System.err.println("**********************Teacher saved successfully*****************************");

	}

}
