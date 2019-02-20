
public class Address {

	private String street;  
	private int houseNumber;
	
	public Address(String street, int houseNumber) {
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + houseNumber;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (houseNumber != other.houseNumber)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address: " + street + ", " + houseNumber;
	}
	
	
	
}
