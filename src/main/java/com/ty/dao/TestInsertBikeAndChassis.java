package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Chassis;

public class TestInsertBikeAndChassis {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Bike b = new Bike();
		b.setName("bullet");
		b.setCost(200000);
		Chassis c = new Chassis();
		c.setType("private");
		c.setBike(b);
		EntityTransaction et = em.getTransaction();
		c.setBike(b);
		b.setChassis(c);
		et.begin();
		em.persist(b);
		em.persist(c);
		et.commit();
		System.out.println("bike and chassis details saved");
	}
}