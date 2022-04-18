package com.capgemini.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int location_id;
//	@Column(name = "locationName")
	private String locationName;
//	@Column(name = "LocationCode")
	private long locationCode;
//	@Column(name = "country")
	private String country;
//	@Column(name = "airportName")
	private String airportName;
	
	public Location() {
		
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public long getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(long locationCode) {
		this.locationCode = locationCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
}