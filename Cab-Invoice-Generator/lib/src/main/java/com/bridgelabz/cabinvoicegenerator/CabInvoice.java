package com.bridgelabz.cabinvoicegenerator;

public class CabInvoice {
	private final static int ratePerKilometer = 10;
	private final static int ratePerMinute = 1;
	private final static int minimumFare = 5;
	private double totalFare;
	
	public double calculateFare(double totalKm, double totalTime) {
		totalFare = (double)((totalKm*ratePerKilometer)+(totalTime*ratePerMinute));
		if((int)totalFare <= minimumFare) return minimumFare;
		return totalFare;
	}
	
}
