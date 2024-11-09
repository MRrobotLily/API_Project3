package miumg.edu.gt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.PersonsEvent;


public interface PersonsEventsRepository extends CrudRepository<PersonsEvent, Long> {
    List<PersonsEvent> findByidEvent(Long idEvent);
}
