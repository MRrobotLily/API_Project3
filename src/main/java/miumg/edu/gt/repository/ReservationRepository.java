package miumg.edu.gt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByidReservation(long idReservation);

}
