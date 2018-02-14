package org.AirlineRepository.Repository;

import java.util.Date;

import org.AirlineRepository.entity.FlightDetail;
import org.springframework.data.repository.CrudRepository;

public interface FlightDetailsRepository extends CrudRepository<FlightDetail, String> {

	FlightDetail findByFlightDepartureDate(Date departDate);
	
}
