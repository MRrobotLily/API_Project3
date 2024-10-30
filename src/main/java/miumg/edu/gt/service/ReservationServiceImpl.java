package miumg.edu.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.Reservation;
import miumg.edu.gt.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public List<Reservation> getAllReservation() {
		return (List<Reservation>) reservationRepository.findAll();
	}

	@Override
	public Reservation getReservationById(Long ReservationId) {
		return reservationRepository.findById(ReservationId).get();
	}

	@Override
	public Reservation addReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation updateReservation(Reservation reservation, Long ReservationId) {
		Reservation ReservationObj = reservationRepository.findById(ReservationId).get();
		if (ReservationObj != null) {
			ReservationObj.setReservationStatus(reservation.getReservationStatus());
		}
		return reservationRepository.save(ReservationObj);
	}

	@Override
	public String deleteReservation(Long ReservationId) {
		Reservation ReservationObj = reservationRepository.findById(ReservationId).get();
		if (ReservationObj != null) {
			reservationRepository.delete(ReservationObj);
		}
		return "Reservacion eliminada con exito!";
	}
	
	@Override
	  public List<Reservation> getReservationByidReservation(Long idReservation) {
	        return reservationRepository.findByidReservation(idReservation);
	    }

}
