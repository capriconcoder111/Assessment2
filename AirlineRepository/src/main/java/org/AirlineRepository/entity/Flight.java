package org.AirlineRepository.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the flight database table.
 * 
 */
@Entity
@NamedQuery(name="Flight.findAll", query="SELECT f FROM Flight f")
public class Flight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flight_id")
	private String flightId;

	@Column(name="airline_id")
	private String airlineId;

	@Column(name="airline_name")
	private String airlineName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="arrival_time")
	private Date arrivalTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="departure_time")
	private Date departureTime;

	private Time duration;

	@Column(name="from_location")
	private String fromLocation;

	@Column(name="to_location")
	private String toLocation;

	@Column(name="total_seats")
	private int totalSeats;

	//bi-directional many-to-one association to FlightDetail
	@OneToMany(mappedBy="flight")
	private List<FlightDetail> flightDetails;

	public Flight() {
	}

	public String getFlightId() {
		return this.flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlineId() {
		return this.airlineId;
	}

	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return this.airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public Date getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Time getDuration() {
		return this.duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public String getFromLocation() {
		return this.fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return this.toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public int getTotalSeats() {
		return this.totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<FlightDetail> getFlightDetails() {
		return this.flightDetails;
	}

	public void setFlightDetails(List<FlightDetail> flightDetails) {
		this.flightDetails = flightDetails;
	}

	public FlightDetail addFlightDetail(FlightDetail flightDetail) {
		getFlightDetails().add(flightDetail);
		flightDetail.setFlight(this);

		return flightDetail;
	}

	public FlightDetail removeFlightDetail(FlightDetail flightDetail) {
		getFlightDetails().remove(flightDetail);
		flightDetail.setFlight(null);

		return flightDetail;
	}

}