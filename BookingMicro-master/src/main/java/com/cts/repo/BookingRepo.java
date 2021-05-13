package com.cts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
