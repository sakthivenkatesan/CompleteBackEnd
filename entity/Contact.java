package com.capgemini.springboot.entity;


import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contact_id;
//	@Column(name = "address")
	private String addressLine;
//	@Column(name = "zipcode")
	private long zipCode;
//	@Column(name = "city")
	private String city;
//	@Column(name = "state")
	private String state;
//	@Column(name = "country")
	private String country;
//	@Column(name = "mobile")
	private long mobileNo;
	
	public Contact() {
		
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}