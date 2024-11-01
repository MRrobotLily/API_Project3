package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.Locations;

public interface LocationService {

	List<Locations> getAllLocations();
	Locations getLocationsById(Long LocationsId);
	Locations addLocations(Locations locations);
	Locations updateLocations(Locations locations, Long LocationsId);
	String deleteLocations(Long LocationsId);
	Locations getLocationsBylocationName(String locationName);
}
