package phonebookProject;

public class Person {
		
		protected String firstName;
		protected String lastName;
		protected String phoneNumber;
		protected String email;
		protected Address address;

		public Person() {
			
		}

		public Person(String firstName, String lastName, String phoneNumber, String email, Address address) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.address = address;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public String getStreetNum() {
			return address.streetNum;
		}

		public void setStreetNum(String streetNum) {
			this.address.streetNum = streetNum;
		}

		public String getStreetName() {
			return address.streetName;
		}

		public void setStreetName(String streetName) {
			this.address.streetName = streetName;
		}

		public String getCity() {
			return address.city;
		}

		public void setCity(String city) {
			this.address.city = city;
		}

		public String getState() {
			return address.state;
		}

		public void setState(String state) {
			this.address.state = state;
		}

		@Override
		public String toString() {
			return "Contact: [First Name: " + firstName + ", Last Name: " + lastName + ", Phone Number: " + phoneNumber
					+ ", Email: " + email + ", Address: " + address.toString() + "]";
		}

}
