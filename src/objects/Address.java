package objects;

public class Address {
    
public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

private int plz;
private String streetName;
private String country;

	public Address(int plz, String streetName, String country) {
		this.plz = plz;
		this.streetName = streetName;
		this.country = country;
	}

}
