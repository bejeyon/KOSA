package classes;

class TravelV01DTO {
	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPerson;

	public static final int INDIVIDUAL = 0;
	public static final int PACKAGE = 1;

	// getter
	public String getTravelCode() {
		return travelCode;
	}
	public String getCityName() {
		return cityName;
	}
	public String getFlight() {
		return flight;
	}
	public String getTravelType() {
		String tt = "";
		if(travelType == INDIVIDUAL)
			tt = "자유여행";
		if(travelType == PACKAGE)
			tt = "패키지여행";
		return tt;
	}
	public int getMaxPerson() {
		return maxPerson;
	}

	// setter
	public void setTravelCode(String travelCode) {
		this.travelCode = travelCode;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public void setTravelType(int travelType) {
		this.travelType = travelType;
	}
	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}

	TravelV01DTO() {}

	TravelV01DTO(String travelCode, String cityName, String flight, int travelType, int maxPerson) {
		setTravelCode(travelCode);
		setCityName(cityName);
		setFlight(flight);
		setTravelType(travelType);
		setMaxPerson(maxPerson);
	}
}