package controller;

import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Airports;
import pojo.Flight_tickets;
import pojo.Flights;
import service.FlightsService;

@Controller
public class FlightController {
//	添加日志
	private Logger logger = Logger.getLogger(FlightController.class);
	
	@Resource
	private FlightsService flightsService;
	/**
	 * 查询信息123
	 * @param model
	 * @param flightDate
	 * @param takeoff
	 * @param landing
	 * @return
	 */
	@RequestMapping(value="/flight")
	public String allFlights(Model model,String flightDate,String takeoff,String landing){
		List<Flights> flightsList=null;
		try {
			flightsList = flightsService.allFlights(new Flights(flightDate,new Airports(takeoff),new Airports(landing)));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		model.addAttribute("flightsList", flightsList);
		return "index";
	}
	@RequestMapping(value="/allFlight_tickets.json",method=RequestMethod.GET)
	@ResponseBody
	public List<Flight_tickets> allFlight_tickets (@RequestParam int id){
		List<Flight_tickets> lists=null;
		try{
			lists=	flightsService.allFlight_tickets(id);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lists;
				
	}	
}
