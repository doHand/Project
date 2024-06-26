package com.mycompany.goldenTime.model;

import java.sql.Timestamp;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String email;
	private Timestamp rDate;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Timestamp getrDate() {
		return rDate;
	}
	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
	    return "MemberVO{" +
	            "id='" + id + '\'' +
	            ", pw='" + pw + '\'' +
	            ", name='" + name + '\'' +
	            ", phone='" + phone + '\'' +
	            ", email='" + email + '\'' +
	            ", rDate=" + rDate +
	            ", address='" + address + '\'' +
	            '}';
	}

}
