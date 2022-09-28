package phonebookProject;

public class Address {

	protected String streetNum;
	protected String streetName;
	protected String city;
	protected String state;
	
	public Address() {
		
	}
	
	public Address(String streetNum, String streetName, String city, String state) {
		super();
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address: [Street Number: " + streetNum + ", Street Name: " + streetName + ", City: " + city + ", State:" + state
				+ "]";
	}
	
}
