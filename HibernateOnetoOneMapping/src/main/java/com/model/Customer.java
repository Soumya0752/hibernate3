package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer 
{
	  
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="cust_id")
       private int id;
	   @Column(name="cust_name")
       private String name;
	   @Column(name="cust_phno")
       private int phnno;
	   
	   
	   @OneToOne(cascade=CascadeType.ALL)
	   private Cart cart;


	public Customer(int id, String name, int phnno, Cart cart) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
		this.cart = cart;
	}


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


	public int getPhnno() {
		return phnno;
	}


	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phnno=" + phnno + ", cart=" + cart + "]";
	}
	   
		
		
		
	   
	   
       
}
