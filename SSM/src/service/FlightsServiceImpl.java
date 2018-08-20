package service;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import dao.FlightsMapper;

import pojo.Flight_tickets;
import pojo.Flights;

@Service
public class FlightsServiceImpl implements FlightsService {
	
	@Resource
	private FlightsMapper flightsMapper;
	
	@Override
	public List<Flight_tickets> allFlight_tickets(int flightId)
			throws Exception {
		// TODO Auto-generated method stub
		return flightsMapper.getAllFlight_tickets(flightId);
	}
	@Override
	public List<Flights> allFlights(Flights flight) throws Exception {
		// TODO Auto-generated method stub
		return flightsMapper.getAllFlights(flight);
	}

}
