package org.AirlineRESTService.controller;

import org.AirlineRepository.Service.IFlightService;
import org.AirlineRepository.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {

	private IFlightService flightService;
	
	@RequestMapping(value={"/",""}, method = RequestMethod.GET)
	public ResponseEntity<?> getFlights()
	{
		return new ResponseEntity(flightService.getAll(),HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value={"/{flightId}"}, method = RequestMethod.GET)
	public Flight getFlightById(@PathVariable("flightId") String flightId)
	{
		return flightService.findFlightByID(flightId);
	}
}
