package com.taragani.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="plans")
public class Plan {
	
	@Id 
	@Column(name="p_title")
	private String pTitle;
	@Column(name="speed")
	private int speed;
	@Column(name="max_usage")
	private int maxUsage;
	@Column(name="charge")
	private double charge;
	@Column(name="product")
	private String product;
	
	public Plan() {
	}
	
	public Plan(String pTitle, int speed, int maxUsage, double charge,String Product) {
		super();
		this.pTitle = pTitle;
		this.speed = speed;
		this.maxUsage = maxUsage;
		this.charge = charge;
		this.product=Product;
	}

	public String getpTitle() {
		return pTitle;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxUsage() {
		return maxUsage;
	}

	public void setMaxUsage(int maxUsage) {
		this.maxUsage = maxUsage;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	
}
