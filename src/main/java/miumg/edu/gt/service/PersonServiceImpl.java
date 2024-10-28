package miumg.edu.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import miumg.edu.gt.entity.Persons;
import miumg.edu.gt.repository.PersonsRepository;


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

}
