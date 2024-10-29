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

import miumg.edu.gt.entity.Locations;
import miumg.edu.gt.service.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/Locations")
	public ResponseEntity<List<Locations>> getAllLocations(){
		return ResponseEntity.ok(locationService.getAllLocations());
	}
	
	@GetMapping("/Locations/{LocationId}")
	public ResponseEntity<Locations> getLocationById(@PathVariable("LocationsId") Long LocationsId){
		return ResponseEntity.ok(locationService.getLocationsById(LocationsId));
	}
	
	@PostMapping("/Locations")
	public ResponseEntity<Locations> addLocation(@RequestBody Locations locations){
		return ResponseEntity.ok(locationService.addLocations(locations));
	}
	
	@PatchMapping("/Locations")
	public ResponseEntity<Locations> updateLocations(@RequestBody Locations locations, @PathVariable("LocationsId") Long LocationsId){
		return ResponseEntity.ok(locationService.updateLocations(locations, LocationsId));
	}
	
	@DeleteMapping("/Location/{LocationId}")
	public ResponseEntity<String> deleteLocations(@PathVariable("LocationsId") Long LocationsId){
		return ResponseEntity.ok(locationService.deleteLocations(LocationsId));
	}
}

