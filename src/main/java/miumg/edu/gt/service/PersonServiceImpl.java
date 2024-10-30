package miumg.edu.gt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.Events;
import miumg.edu.gt.entity.Persons;
import miumg.edu.gt.repository.PersonsRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonsRepository personsRepository;
	
	@Override
	public List<Persons> getAllPersons() {
		return (List<Persons>) personsRepository.findAll();
	}

	@Override
	public Persons getPersonsById(Long PersonsId) {
		return personsRepository.findById(PersonsId).get();
	}

	@Override
	public Persons addPersons(Persons persons) {
	    Optional<Persons> existingPerson = personsRepository.findByemail(persons.getemail());
	    if (existingPerson.isPresent()) {
	        throw new IllegalArgumentException("El correo electrónico ya está registrado, Ingrese uno nuevo");
	    }
		return personsRepository.save(persons);
	}

	@Override
	public Persons updatePersons(Persons persons, Long PersonsId) {
		Persons PersonsObj = personsRepository.findById(PersonsId).get();
		if (PersonsObj != null) {
			PersonsObj.setcontactNumber(persons.getcontactNumber());
			PersonsObj.setemail(persons.getemail());
			PersonsObj.setage(persons.getage());
		}
		return personsRepository.save(PersonsObj);
	}

	@Override
	public String deletePersons(Long PersonsId) {
		Persons PersonsObj = personsRepository.findById(PersonsId).get();
		if (PersonsObj != null) {
			personsRepository.delete(PersonsObj);
		}
		return "Persona eliminada con exito!";
	}
	
	@Override
	  public List<Persons> getPersonsByidUser(Long idUser) {
	        return personsRepository.findByidUser(idUser);
	    }

}
