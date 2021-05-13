package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Booking;
import com.example.demo.model.Flight;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
    private UserRepository ur;

	public User login(String uname, String password) {

		User u = ur.findByUname(uname);
		if (u == null) {
			System.out.println("No such email registered");
			return null;
		}
		if (u.getPassword().equals(password)) {
			System.out.println("Welcome " + u.getFname());
			System.out.println("You have successfully logged in");
		} else {
			System.out.println("Incorrect password");
			return null;
		}
		return u;

	}

	public void register(User u) {
		System.out.println("Ur value:" + ur);
		ur.save(u);
		System.out.println("User successfully registered");

	}

	public Flight searchFlights(String source, String destination) {
		String uri = "http://localhost:8081/flights";
		ResponseEntity<Flight[]> response = restTemplate.getForEntity(uri, Flight[].class);
		Flight[] f = response.getBody();
		for (Flight fi : f) {
			if (fi.getSource().equalsIgnoreCase(source) && fi.getDestination().equalsIgnoreCase(destination)) {
				return fi;
			}
		}
		return null;
	}
	
	public double bookTicket(User u,int id,int count) {
		String uri2= "http://localhost:8081/flightid?id="+id;
		System.out.println(id);
		
		ResponseEntity<Flight> response2=restTemplate.getForEntity(uri2, Flight.class);
		Flight flight=response2.getBody();
		System.out.println(flight);
		
		Booking b=new Booking(u.getId(),flight.getId(),count*flight.getCost(),count);
		String uri = "http://localhost:8082/bookFlight";
//		HttpEntity<String> request = new HttpEntity<String>(b);
		
		ResponseEntity<Booking> response = restTemplate.postForEntity(uri, b, Booking.class);
		Booking boo = response.getBody();
		return boo.getTotalAmount();
		
	}
	public String cancelBooking(int id) {
		String uri = "http://localhost:8082/cancelFlight?id="+id;
		try {
			ResponseEntity<String> response2=restTemplate.getForEntity(uri, String.class);
//			Booking boooook=response2.getBody();
			return response2.getBody();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("No such booking id");
			return "Not cancelled";
		}
	}

}
