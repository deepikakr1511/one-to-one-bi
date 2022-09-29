package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Chassis;

public class TestGetBikeAndChassis {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Chassis cs = em.find(Chassis.class, 1);
			System.out.println("------Chassis details------");
			System.out.println("Chassis ID is : "+cs.getId());
			System.out.println("Chassis Name is : "+cs.getType());
			Bike bike = cs.getBike();
			if(bike!=null) {
				System.out.println("-------Bike info-------");
				System.out.println("Bike ID is : "+bike.getId());
				System.out.println("Bike Name is : "+bike.getName());
				System.out.println("Bike chassis is built on : "+bike.getChassis());
				System.out.println("Bike costs : "+bike.getCost());
			}
	}
}