package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class User {
@Id
private int id;
private String fname,lname,password,uname;
@CreationTimestamp
private LocalDateTime dateTime;
private String role;



public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public LocalDateTime getDateTime() {
	return dateTime;
}
public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}



@Override
public String toString() {
	return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", password=" + password + ", uname=" + uname
			+ ", dateTime=" + dateTime + ", role=" + role + "]";
}
public User() {
	super();
}
public User(int id, String fname, String lname, String password, String uname, LocalDateTime dateTime, String role) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.password = password;
	this.uname = uname;
	this.dateTime = dateTime;
	this.role = role;
}


}