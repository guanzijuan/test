package service;

import java.util.List;

import pojo.Flight_tickets;
import pojo.Flights;

public interface FlightsService {
	public List<Flights> allFlights(Flights flight) throws Exception;
	public List<Flight_tickets> allFlight_tickets(int flightId)throws Exception;
}
