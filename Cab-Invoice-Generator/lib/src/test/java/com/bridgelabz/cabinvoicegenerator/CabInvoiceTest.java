package com.bridgelabz.cabinvoicegenerator;

import org.junit.Test;

import java.util.ArrayList;

import org.junit.Assert;

public class CabInvoiceTest {
	
	
	ArrayList<CabInvoice> l1 = new ArrayList<>();
	
	
	@Test
	public void shouldReturnTotalFare() {
		CabInvoice cabInvoice = new CabInvoice(1.8,15);
		Assert.assertEquals(33.0, cabInvoice.calculateFare(),0.0);
	}
	
	@Test
	public void shouldReturnTotalFareForMultipleRides() {
		l1.add(new CabInvoice(1.8,15));
		l1.add(new CabInvoice(2,16));
		l1.add(new CabInvoice(4,30));
		CabInvoice cabInvoice = new CabInvoice();
		cabInvoice.calculateFareForMultipleRides(l1);
	}
	
}
