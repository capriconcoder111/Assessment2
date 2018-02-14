package org.AirlineRepository.Service;

import java.util.Date;
import java.util.List;

import org.AirlineRepository.entity.Flight;
import org.AirlineRepository.entity.FlightDetail;

public interface IFlightService {

	Flight findFlightByID(String flightID);
	Flight findFlightByName(String airlineName);
	List<Flight> getAll();
	void addFlight(Flight flight);
	void updateFlight(Flight flight);
	boolean deleteFlight(String flightID);
	
	FlightDetail findFlightDetailsByID(String flightID);
	FlightDetail findFlightDetailsByDepartDate(Date departDate);
	void updateFlightDetails(FlightDetail flightDetails);
	void addFlightDetails(FlightDetail flight);
	boolean deleteFlightDetails(String flightID);
}
