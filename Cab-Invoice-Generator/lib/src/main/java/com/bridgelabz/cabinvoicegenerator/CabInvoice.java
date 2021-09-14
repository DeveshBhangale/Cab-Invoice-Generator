package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;

public class CabInvoice {
	private final static int ratePerKilometer = 10;
	private final static int ratePerMinute = 1;
	private final static int minimumFare = 5;
	private double totalFare,totalKm,totaltime;
	
	public CabInvoice() {}
	
	public CabInvoice(double totalKm, double totaltime) {
		super();
		this.totalKm = totalKm;
		this.totaltime = totaltime;
	}

	
	
	
	public double calculateFare() {
		totalFare = (double)((this.totalKm*ratePerKilometer)+(this.totaltime*ratePerMinute));
		if((int)totalFare <= minimumFare) return minimumFare;
		return totalFare;
	}
	
	public void calculateFareForMultipleRides(ArrayList<CabInvoice> l1) {
		l1.stream().forEach(n -> System.out.println(n.calculateFare()));
	}
	
}
