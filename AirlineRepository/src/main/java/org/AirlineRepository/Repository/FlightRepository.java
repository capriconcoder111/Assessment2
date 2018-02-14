package org.AirlineRepository.Repository;

import org.AirlineRepository.entity.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, String> {

	Flight findByAirlineName(String airlineName);
	
}
