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
		Assert.assertEquals(139.0,cabInvoice.calculateFareForMultipleRides(l1),0.0);
	}
	
	@Test
	public void enhancedInvoice() {
		l1.add(new CabInvoice(1.8,15));
		l1.add(new CabInvoice(2,16));
		l1.add(new CabInvoice(4,30));
		@SuppressWarnings("unused")
		CabInvoice cabInvoice = new CabInvoice();
		double arr[] = CabInvoice.enhancedInvoice(l1);
		Assert.assertEquals(3,(int)arr[0],0.0);
		Assert.assertEquals(139.0,arr[1],0.0);
		Assert.assertEquals(46.0,(int)arr[2],0.0);
	}
	
	
	
}
