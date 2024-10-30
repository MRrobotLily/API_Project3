package miumg.edu.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miumg.edu.gt.entity.Reservation;
import miumg.edu.gt.service.ReservationService;


@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/Reservation")
	public ResponseEntity<List<Reservation>> getAllReservation(){
		return ResponseEntity.ok(reservationService.getAllReservation());
	}
	
	@GetMapping("/Reservation/{ReservationId}")
	public ResponseEntity<Reservation> getReservationById(@PathVariable("ReservationId") Long ReservationId){
		return ResponseEntity.ok(reservationService.getReservationById(ReservationId));
	}
	
	@PostMapping("/Reservation")
	public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation){
		return ResponseEntity.ok(reservationService.addReservation(reservation));
	}
	
	@PatchMapping("/Reservation")
	public ResponseEntity<Reservation> updateReservation(@RequestBody Reservation reservation, @PathVariable("ReservationId") Long ReservationId){
		return ResponseEntity.ok(reservationService.updateReservation(reservation, ReservationId));
	}
	
	@DeleteMapping("/Reservation/{ReservationId}")
	public ResponseEntity<String> deleteReservation(@PathVariable("ReservationId") Long ReservationId){
		return ResponseEntity.ok(reservationService.deleteReservation(ReservationId));
	}
}

