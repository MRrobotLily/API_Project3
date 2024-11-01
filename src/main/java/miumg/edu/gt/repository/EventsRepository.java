package miumg.edu.gt.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Events;

public interface EventsRepository extends CrudRepository<Events, Long> {

    List<Events> findByidUser(Long idUser);

	boolean existsByidLocationAndDateEvent(Long idLocation, LocalDate dateEvent);

}
