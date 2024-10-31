package miumg.edu.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miumg.edu.gt.entity.Events;
import miumg.edu.gt.service.EventService;

@RestController
public class EventsControllers {

	@Autowired
	private EventService eventsService;
	
	@GetMapping("/Events")
	public ResponseEntity<List<Events>> getAllEvents(){
		return ResponseEntity.ok(eventsService.getAllEvents());
	}
	
	@GetMapping("/Events/{EventsId}")
	public ResponseEntity<Events> getEventsById(@PathVariable("EventsId") Long EventsId){
		return ResponseEntity.ok(eventsService.getEventsById(EventsId));
	}
	
	@PostMapping("/Events")
	public ResponseEntity<Events> addEvents(@RequestBody Events events){
		return ResponseEntity.ok(eventsService.addEvents(events));
	}

	
	@PatchMapping("/Events")
	public ResponseEntity<Events> updateEvents(@RequestBody Events events, @PathVariable("EventsId") Long EventsId){
		return ResponseEntity.ok(eventsService.updateEvents(events, EventsId));
	}
	
	@DeleteMapping("/Events/{EventsId}")
	public ResponseEntity<String> deleteEvents(@PathVariable("EventsId") Long EventsId){
		return ResponseEntity.ok(eventsService.deleteEvents(EventsId));
	}
	
	//esto es lo nuevo que se agrego, si no funciona modificarlo,
	
	  @GetMapping("/Users/{idUser}/Events")
	    public ResponseEntity<List<Events>> getEventsByidUser(@PathVariable("idUser") Long idUser) {
	        return ResponseEntity.ok(eventsService.getEventsByidUser(idUser));
	    }
	  
	    // Endpoint para crear o actualizar un evento

	  @PostMapping("/Events/{EventsId}")
	    public ResponseEntity<String> createOrUpdateEvent(@RequestBody Events event) {
	        String response = eventsService.createOrUpdateEvent(event);
	        if (response.contains("reservadas")) {
	            return ResponseEntity.status(HttpStatus.CONFLICT).body(response); // 409 Conflict
	        }
	        return ResponseEntity.ok(response); // 200 OK
	    }
}
