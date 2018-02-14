package org.AirlineRepository.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the flight_details database table.
 * 
 */
@Entity
@Table(name="flight_details")
@NamedQuery(name="FlightDetail.findAll", query="SELECT f FROM FlightDetail f")
public class FlightDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="available_seats")
	private int availableSeats;

	@Temporal(TemporalType.DATE)
	@Column(name="flight_departure_date")
	private Date flightDepartureDate;

	private double price;

	//bi-directional many-to-one association to Flight
	@ManyToOne
	@JoinColumn(name="`flight_id(FK)`")
	private Flight flight;

	public FlightDetail() {
	}

	public int getAvailableSeats() {
		return this.availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Date getFlightDepartureDate() {
		return this.flightDepartureDate;
	}

	public void setFlightDepartureDate(Date flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Flight getFlight() {
		return this.flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}