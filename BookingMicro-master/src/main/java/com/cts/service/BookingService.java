package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Booking;
import com.cts.repo.BookingRepo;

@Service
public class BookingService {

	@Autowired
	BookingRepo br;
	public Booking addBooking(Booking b)
	{
		return br.save(b);
	}
	
	
}
