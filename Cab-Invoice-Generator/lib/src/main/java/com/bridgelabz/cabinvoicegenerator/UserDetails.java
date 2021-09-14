package com.bridgelabz.cabinvoicegenerator;

public class UserDetails {
	private String name;
	private double totalFare;
	private double avgTotalFare;
	private int totalRides;
	
	public UserDetails(String name, double totalFare, double avgTotalFare, double totalRides) {
		super();
		this.name = name;
		this.totalFare = totalFare;
		this.avgTotalFare = avgTotalFare;
		this.totalRides = (int)totalRides;
	}


	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", totalFare=" + totalFare + ", avgTotalFare=" + avgTotalFare
				+ ", totalRides=" + totalRides + "]";
	}
	
}
