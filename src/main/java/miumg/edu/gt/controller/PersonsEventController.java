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

import miumg.edu.gt.entity.PersonsEvent;
import miumg.edu.gt.service.PersonsEventService;

@RestController
public class PersonsEventController {

	@Autowired
	private PersonsEventService personsEventService;
	
	@GetMapping("/Persons/Event")
	public ResponseEntity<List<PersonsEvent>> getAllPersons(){
		return ResponseEntity.ok(personsEventService.getAllPersons());
	}
	
	@GetMapping("/Persons/Event/{idPerson}")
	public ResponseEntity<PersonsEvent> getPersonsById(@PathVariable("idPerson") Long idPerson){
		return ResponseEntity.ok(personsEventService.getPersonsById(idPerson));
	}
	
	@PostMapping("/Persons/Event")
	public ResponseEntity<PersonsEvent> addPersons(@RequestBody PersonsEvent persons){
		return ResponseEntity.ok(personsEventService.addPersons(persons));
	}
	
	@PatchMapping("/Persons/Event")
	public ResponseEntity<PersonsEvent> updatePersons(@RequestBody PersonsEvent persons, @PathVariable("idPerson") Long idPerson){
		return ResponseEntity.ok(personsEventService.updatePersons(persons, idPerson));
	}
	
	@DeleteMapping("/Persons/Event/{idPerson}")
	public ResponseEntity<String> deletePersons(@PathVariable("idPerson") Long idPerson){
		return ResponseEntity.ok(personsEventService.deletePersons(idPerson));
	}
	

	  @GetMapping("/Event/{idEvent}/Persons")
	    public ResponseEntity<List<PersonsEvent>> getPersonsByidEvent(@PathVariable("idUser") Long idEvent) {
	        return ResponseEntity.ok(personsEventService.getPersonsByidEvent(idEvent));
	    }
	  
}
