package miumg.edu.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.Locations;
import miumg.edu.gt.repository.LocationRepository;


@Service 
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public List<Locations> getAllLocations() {
		return (List<Locations>) locationRepository.findAll();
	}

	@Override
	public Locations getLocationsById(Long LocationsId) {
		return locationRepository.findById(LocationsId).get();
	}

	@Override
	public Locations addLocations(Locations locations) {
		return locationRepository.save(locations);
	}

	@Override
	public Locations updateLocations(Locations locations, Long LocationsId) {
		Locations LocationsObj = locationRepository.findById(LocationsId).get();
		if (LocationsObj != null) {
			LocationsObj.setLocationStatus(locations.getLocationStatus());
		}
		return locationRepository.save(LocationsObj);
	}

	@Override
	public String deleteLocations(Long LocationsId) {
		Locations LocationsObj = locationRepository.findById(LocationsId).get();
		if (LocationsObj != null) {
			locationRepository.delete(LocationsObj);
		}
		return "Dirección eliminada con exito!";
	}	
}
