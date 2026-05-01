package com.jsp.entity;


	
	
	import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


	@Entity
	@Table(name="users")

	public class User {
		
		@Id 
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int id;
		
		//@Column(nullable= false)
		
		
		
		@Column(name="name", nullable= false)
		public String name;
		
		@Column(name="password",  nullable= false)
		private String password;
		
		@Column(name="email" , unique=true,  nullable= false)
		private String email;
		
		@Column(name="contact",  nullable= false)
		private String contact;
		
		
		
		 @OneToMany
		    @JoinColumn(name = "orders_id")
		    private List<Order> order;

		public String getName() {
			return name;
		}

		public List<Order> getOrder() {
			return order;
		}

		public void setOrder(List<Order> order) {
			this.order = order;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public User(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContact() {
			return  contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public User(String name, String password, String email, String contact) {
			super();
			this.name = name;
			this.password = password;
			this.email = email;
			this.contact = contact;
		}

		public User() {
			super();
		}

		public static int getId() {
			// TODO Auto-generated method stub
			
				return 0;
			
		}
		

		

}
