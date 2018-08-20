package pojo;

public class Airports {
	 private int id;
	 private String airportname;
	 private String cityname;
	public Airports(int id, String airportname, String cityname) {
		super();
		this.id = id;
		this.airportname = airportname;
		this.cityname = cityname;
	}
	
	public Airports(String cityname) {
		super();
		this.cityname = cityname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirportname() {
		return airportname;
	}
	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Airports() {
		super();
	}
	 
}
