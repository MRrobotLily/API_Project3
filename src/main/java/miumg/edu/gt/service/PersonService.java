package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.Events;
import miumg.edu.gt.entity.Persons;

public interface PersonService {
	
	List<Persons> getAllPersons();
	Persons getPersonsById(Long PersonsId);
	Persons addPersons(Persons persons);
	Persons updatePersons(Persons persons, Long PersonsId);
	String deletePersons(Long PersonsId);
	List<Persons> getPersonsByidUser(Long idUser);

}
