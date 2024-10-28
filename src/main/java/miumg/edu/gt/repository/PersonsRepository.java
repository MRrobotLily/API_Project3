package miumg.edu.gt.repository;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Persons;

public interface PersonsRepository extends CrudRepository<Persons, Long> {

}
