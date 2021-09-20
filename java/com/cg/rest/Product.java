package com.cg.rest;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="prod_spring")
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private int quantity;
	private double price;
//	@JsonDeserialize(using =DateDeserializer.class)
//	@JsonSerialize(using = DateSerializer.class)
//	@Basic
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/calcutta")
	private Date expiryDate;
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + ", price=" + price
				+ ", expiryDate=" + expiryDate + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, int quantity, double price, Date expiryDate) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public Product(Product prod) { //copy constructor
		this.prodId = prod.getProdId();
		this.prodName = prod.getProdName();
		this.quantity = prod.getQuantity();
		this.price = prod.getPrice();
		this.expiryDate =new Date(prod.getExpiryDate().getTime());
	}
	public void copy(Product prod) {
		this.prodId = prod.getProdId();
		this.prodName = prod.getProdName();
		this.quantity = prod.getQuantity();
		this.price = prod.getPrice();
		this.expiryDate =new Date(prod.getExpiryDate().getTime());
		
	}


}
