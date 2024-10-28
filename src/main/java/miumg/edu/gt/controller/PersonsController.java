package miumg.edu.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miumg.edu.gt.entity.Persons;
import miumg.edu.gt.service.PersonService;

@RestController
public class PersonsController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/Persons")
	public ResponseEntity<List<Persons>> getAllPersons(){
		return ResponseEntity.ok(personService.getAllPersons());
	}
	
	@GetMapping("/Persons/{PersonsId}")
	public ResponseEntity<Persons> getPersonsById(@PathVariable("PersonsId") Long PersonsId){
		return ResponseEntity.ok(personService.getPersonsById(PersonsId));
	}
	
	@PostMapping("/Persons")
	public ResponseEntity<Persons> addPersons(@RequestBody Persons persons){
		return ResponseEntity.ok(personService.addPersons(persons));
	}
	
	@PatchMapping("/Persons")
	public ResponseEntity<Persons> updatePersons(@RequestBody Persons persons, @PathVariable("PersonsId") Long PersonsId){
		return ResponseEntity.ok(personService.updatePersons(persons, PersonsId));
	}
	
	@DeleteMapping("/Persons/{PersonsId}")
	public ResponseEntity<String> deletePersons(@PathVariable("PersonsId") Long PersonsId){
		return ResponseEntity.ok(personService.deletePersons(PersonsId));
	}
}

