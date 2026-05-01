package com.jsp.entity;


	
	import jakarta.persistence.*;
	import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.Table;


	@Entity
	@Table(name="Orders")
	public class Order {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    // Many orders → One user
	    @ManyToOne
	    @JoinColumn(name = "users_id")
	    private User user;

	    // Many orders → One product
	    @ManyToOne
	    @JoinColumn(name = "products_id")
	   private Product product;
	    
//	    @OneToMany(mappedBy="order",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	    private List<Product> products;
//
	    private int quantity;

	    private double totalPrice;

	    //@Temporal(TemporalType.TIMESTAMP)
	    //private Date orderDate;

	    // ---------- Constructors ----------
	    public Order() {
	    }

	    public Order(User user, Product product, int quantity, double totalPrice) {
	        this.user = user;
	        this.product = product;
	        this.quantity = quantity;
	        this.totalPrice = totalPrice;
	       // this.orderDate = new Date();
	    }

	    // ---------- Getters & Setters ----------
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(double totalPrice) {
	        this.totalPrice = totalPrice;
	    }

//	    public Date getOrderDate() {
//	        return orderDate;
//	    }
//
//	    public void setOrderDate(Date orderDate) {
//	        this.orderDate = orderDate;
//	    }
	}


