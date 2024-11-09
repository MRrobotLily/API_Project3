package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.PersonsEvent;

public interface PersonsEventService {

	List<PersonsEvent> getAllPersons();
	PersonsEvent getPersonsById(Long idPerson);
	PersonsEvent addPersons(PersonsEvent personsEvent);
	PersonsEvent updatePersons(PersonsEvent persons, Long idPerson);
	String deletePersons(Long idPerson);
	List<PersonsEvent> getPersonsByidEvent(Long idEvent);
	
}
