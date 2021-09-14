package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.HashMap;

public class CabInvoice {
	private final static int ratePerKilometerForNormal = 10;
	private final static int ratePerMinuteForNormal = 1;
	private final static int minimumFareForNormal = 5;
	private final static int ratePerKilometerForPremium = 15;
	private final static int ratePerMinuteForPremium = 2;
	private final static int minimumFareForPremium = 20;
	private static double totalFare;
	private double totalKm;
	private double totaltime;
	private serviceType serviceType;
	
	public CabInvoice() {}
	
	public CabInvoice(double totalKm, double totaltime,serviceType serviceType) {
		super();
		this.totalKm = totalKm;
		this.totaltime = totaltime;
		this.serviceType = serviceType;
	}

	
	
	
	public double calculateFare() {
		if(serviceType.equals(serviceType.NORMAL)) {
			totalFare = (double)((this.totalKm*ratePerKilometerForNormal)+(this.totaltime*ratePerMinuteForNormal));
			if((int)totalFare <= minimumFareForNormal) return minimumFareForNormal;
		}
		else {
			totalFare = (double)((this.totalKm*ratePerKilometerForPremium)+(this.totaltime*ratePerMinuteForPremium));
			if((int)totalFare <= minimumFareForPremium) return minimumFareForPremium;
		}
		return totalFare;
	}
	
	public static double calculateFareForMultipleRides(ArrayList<CabInvoice> l1) {
		totalFare = 0;
		l1.stream().forEach(n -> totalFare +=n.calculateFare());
		return totalFare;
	}
	
	public static double[] enhancedInvoice(ArrayList<CabInvoice> l1) {
		totalFare = calculateFareForMultipleRides(l1);
		double arr[] = {(double)l1.size(),totalFare,Math.round(totalFare/(double)l1.size())};
		return arr;
	}

	public void getUserInvoice(HashMap<String, ArrayList<CabInvoice>> repository) {
		repository.forEach((key,value) -> {
			double arr[] = enhancedInvoice(value);
			System.out.println(new UserDetails(key,arr[1],arr[2],arr[0]).toString());
		});
	}
}
