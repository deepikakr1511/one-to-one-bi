package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class FindPersonByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person p = entityManager.find(Person.class,1);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getGender());

		Pan pan = p.getPan();
		if (pan != null) {
			System.out.println("*****************pan details**************");
			System.out.println(pan.getId());
			System.out.println(pan.getNumber());
			System.out.println(pan.getType());
		}

	}

}
