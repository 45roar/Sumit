package com.pms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Doctor-Info")
public class Doctor {
	@Id
	private int doctorId;
	private String username;
	private String contact;
	private String email;
	private String password;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", username=" + username + ", contact=" + contact + ", email=" + email
				+ ", password=" + password + "]";
	}

	public Doctor(int doctorId, String username, String contact, String email, String password) {
		super();
		this.doctorId = doctorId;
		this.username = username;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

}
