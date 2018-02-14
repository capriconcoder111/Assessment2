package org.AirlineRepository.Service;

import java.util.Date;
import java.util.List;

import org.AirlineRepository.Repository.FlightDetailsRepository;
import org.AirlineRepository.Repository.FlightRepository;
import org.AirlineRepository.entity.Flight;
import org.AirlineRepository.entity.FlightDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private FlightDetailsRepository flightDetailsRepository;
	
	
	@Override
	public Flight findFlightByID(String flightID) {
		// TODO Auto-generated method stub

		System.out.println(flightID);
		
		System.out.println(flightRepository.findOne(flightID));
		return flightRepository.findOne(flightID);
		
	}

	@Override
	public Flight findFlightByName(String fightName) {
		// TODO Auto-generated method stub
		return flightRepository.findByAirlineName(fightName);
	}

	@Override
	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		return (List<Flight>) flightRepository.findAll();
	}

	@Override
	public void addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
	}

	@Override
	public void updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		
		if(flightRepository.findOne(flight.getAirlineId()) == null)
		{
			flightRepository.save(flight);
		}
	}

	@Override
	public boolean deleteFlight(String flightID) {
		
		if(flightID == null)
		{
			return false;
		}
		else{
			flightRepository.delete(flightID);
			return true;
		}
		
	}

	@Override
	public FlightDetail findFlightDetailsByID(String flightID) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.findOne(flightID);
	}

	@Override
	public FlightDetail findFlightDetailsByDepartDate(Date departDate) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.findByFlightDepartureDate(departDate);
	}

	@Override
	public void updateFlightDetails(FlightDetail flightDetails) {
		// TODO Auto-generated method stub
		if(flightDetailsRepository.findOne(flightDetails.getFlight().getFlightId()) == null)
		{
			flightDetailsRepository.save(flightDetails);
		}
		
	}

	@Override
	public void addFlightDetails(FlightDetail flightDetail) {
		// TODO Auto-generated method stub
		flightDetailsRepository.save(flightDetail);
	}

	@Override
	public boolean deleteFlightDetails(String flightID) {
		// TODO Auto-generated method stub
		
		if(flightID == null)
		{
			return false;
		}
		else
		{
			flightDetailsRepository.delete(flightID);
			return true;
		}
	}

	
}
