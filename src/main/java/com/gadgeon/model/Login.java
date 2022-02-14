package com.gadgeon.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String email;
	private String password;
	
	public int getId() {
		return Id;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String email, String pasword) {
		super();
		this.email = email;
		this.password = pasword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return password;
	}
	public void setPasword(String pasword) {
		this.password = pasword;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", pasword=" + password + "]";
	}
	
}
