package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;

public class CabInvoice {
	private final static int ratePerKilometer = 10;
	private final static int ratePerMinute = 1;
	private final static int minimumFare = 5;
	private static double totalFare;
	private double totalKm;
	private double totaltime;
	
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
	
	public static double calculateFareForMultipleRides(ArrayList<CabInvoice> l1) {
		totalFare = 0;
		l1.stream().forEach(n -> totalFare +=n.calculateFare());
		return totalFare;
	}
	
	public static double[] enhancedInvoice(ArrayList<CabInvoice> l1) {
		totalFare = calculateFareForMultipleRides(l1);
		double arr[] = {(double)l1.size(),totalFare,totalFare/(double)l1.size()};
		return arr;
	}
}
