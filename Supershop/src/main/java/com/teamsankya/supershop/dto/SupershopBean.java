package com.teamsankya.supershop.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_table")
public class SupershopBean {
	@Id
	@GeneratedValue
	@Column(name="pro_id")
	private int proId;
	@Column(name="cat_name")
	private String catName;
	@Column(name="pro_name")
	private String proName;
	@Column(name="pro_price")
	private double price;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SupershopBean [proId=" + proId + ", catName=" + catName + ", proName=" + proName + ", price=" + price
				+ "]";
	}

	
}
