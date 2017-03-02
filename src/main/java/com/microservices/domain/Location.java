package com.microservices.domain;

public class Location {

	private String city;

	private String country;

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + "]";
	}
}
