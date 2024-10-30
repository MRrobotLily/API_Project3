package miumg.edu.gt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Persons;

public interface PersonsRepository extends CrudRepository<Persons, Long> {
    Optional<Persons> findByemail(String email);
    List<Persons> findByidUser(Long idUser);

}
