package miumg.edu.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.PersonsEvent;
import miumg.edu.gt.repository.PersonsEventsRepository;

@Service
public class PersonsEventServiceImpl implements PersonsEventService {

	@Autowired
	private PersonsEventsRepository personsEventsRepository;
	
	@Override
	public List<PersonsEvent> getAllPersons() {
		return (List<PersonsEvent>) personsEventsRepository.findAll();
	}

	@Override
	public PersonsEvent getPersonsById(Long idPerson) {
		return personsEventsRepository.findById(idPerson).get();
	}

	@Override
	public PersonsEvent addPersons(PersonsEvent personsEvent) {
		return personsEventsRepository.save(personsEvent);
	}

	@Override
	public PersonsEvent updatePersons(PersonsEvent persons, Long idPerson) {
		PersonsEvent PersonsObj = personsEventsRepository.findById(idPerson).get();
		if (PersonsObj != null) {
			PersonsObj.setContactNumber(persons.getContactNumber());
			PersonsObj.setEmail(persons.getEmail());
			PersonsObj.setAge(persons.getAge());
		}
		return personsEventsRepository.save(PersonsObj);
	}

	@Override
	public String deletePersons(Long idPerson) {
		PersonsEvent PersonsObj = personsEventsRepository.findById(idPerson).get();
		if (PersonsObj != null) {
			personsEventsRepository.delete(PersonsObj);
		}
		return "Persona eliminada con exito!";
	}

	@Override
	public List<PersonsEvent> getPersonsByidEvent(Long idEvent) {
		return personsEventsRepository.findByidEvent(idEvent);
	}

}
