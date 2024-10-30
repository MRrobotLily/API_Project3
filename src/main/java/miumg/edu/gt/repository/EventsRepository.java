package miumg.edu.gt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Events;

public interface EventsRepository extends CrudRepository<Events, Long> {

    List<Events> findByidUser(Long idUser);

}
