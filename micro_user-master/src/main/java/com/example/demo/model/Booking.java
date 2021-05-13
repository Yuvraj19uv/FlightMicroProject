package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
@Entity
public class Booking {
	@Id
    @GeneratedValue
    @Column(name = "BOOKING_ID")
    private int id;
	private int userId;
	private int flightId;
	private double totalAmount;
	@CreationTimestamp
	private LocalDateTime dateTime;
	@Column(name="noOfSeats")
	private int noOfSeats;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", userId=" + userId + ", flightId=" + flightId + ", totalAmount=" + totalAmount
				+ ", dateTime=" + dateTime + ", noOfSeats=" + noOfSeats + "]";
	}
	public Booking(int userId, int flightId, double totalAmount, int noOfSeats) {
		super();
		this.userId = userId;
		this.flightId = flightId;
		this.totalAmount = totalAmount;
		this.noOfSeats = noOfSeats;
	}
	public Booking() {
		
	}
	
	
}
