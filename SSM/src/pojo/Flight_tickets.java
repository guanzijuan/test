package pojo;

public class Flight_tickets {
	private int id;
	private Flights flight;
	private int ticketPrice;
	private String sellCompany;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getSellCompany() {
		return sellCompany;
	}

	public void setSellCompany(String sellCompany) {
		this.sellCompany = sellCompany;
	}

}
