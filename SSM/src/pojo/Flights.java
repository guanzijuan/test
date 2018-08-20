package pojo;

public class Flights {
	private int id;
	private String flightCode;
	private String flightDate;
	private String airline;
	private String type;
	private Airports takeoff;
	private Airports landing;
	private String takeoffTime;
	private String landingTime;
	private String flightTime;
	private String stopAirport;
	private int referencePrice;
	
	public Flights() {
		super();
	}

	public Flights(String flightDate, Airports takeoff, Airports landing) {
		super();
		this.flightDate = flightDate;
		this.takeoff = takeoff;
		this.landing = landing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Airports getTakeoff() {
		return takeoff;
	}

	public void setTakeoff(Airports takeoff) {
		this.takeoff = takeoff;
	}

	public Airports getLanding() {
		return landing;
	}

	public void setLanding(Airports landing) {
		this.landing = landing;
	}

	public String getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(String takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public String getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(String landingTime) {
		this.landingTime = landingTime;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getStopAirport() {
		return stopAirport;
	}

	public void setStopAirport(String stopAirport) {
		this.stopAirport = stopAirport;
	}

	public int getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(int referencePrice) {
		this.referencePrice = referencePrice;
	}

}
