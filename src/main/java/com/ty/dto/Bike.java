package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double cost;
	@OneToOne
	@JoinColumn
	private Chassis chassis;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
}