package miumg.edu.gt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import miumg.edu.gt.entity.Locations;

public interface LocationRepository extends CrudRepository<Locations, Long>{
	
	Optional<Locations> findBylocationName(String locationName);
}
