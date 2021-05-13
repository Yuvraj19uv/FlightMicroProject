package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Booking;
import com.cts.repo.BookingRepo;
import com.cts.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bs;
	@Autowired
	BookingRepo br;
	
	@PostMapping("/bookFlight")
	public Booking bookFlight(@RequestBody Booking b)
	{
		System.out.println(b.getFlightId()+""+b.getId());
		return bs.addBooking(b);
	}
	
	@GetMapping("/cancelFlight")
	public String cancelFlight(@RequestParam int id)
	{
		System.out.println(id);
		br.deleteById(id);
		return "Cancelled";
	}
	
}
