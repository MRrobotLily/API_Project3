package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.Reservation;


public interface ReservationService {
	
	List<Reservation> getAllReservation();
	Reservation getReservationById(Long ReservationId);
	Reservation addReservation(Reservation reservation);
	Reservation updateReservation(Reservation reservation, Long ReservationId);
	String deleteReservation(Long ReservationId);
	List<Reservation> getReservationByidReservation(Long idReservation);
}
