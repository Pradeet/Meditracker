package com.kumbhthon.meditracker;

public class Hospital {
	public String name;
	public double longitude;
	public double latitude;
	public String address;
	public String route;

	public Hospital(String name, double latitude, double longitude,
			String address, String route) {
		super();
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.route = route;
	}
}
