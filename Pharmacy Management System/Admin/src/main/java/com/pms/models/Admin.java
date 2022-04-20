package com.pms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admin-Info")
public class Admin {

	@Id
	private int id;
	private String username;
	private String contact;
	private String email;
	private String password;

	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(int id, String username, String contact, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", contact=" + contact + ", email=" + email
				+ ", password=" + password + "]";
	}

}
