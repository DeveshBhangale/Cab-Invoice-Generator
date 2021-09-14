package com.bridgelabz.cabinvoicegenerator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;

public class CabInvoiceTest {
	
	
	ArrayList<CabInvoice> l1 = new ArrayList<>();
	HashMap<String,ArrayList<CabInvoice>> repository = new HashMap<>();
	
	@Test
	public void shouldReturnTotalFare() {
		CabInvoice cabInvoice = new CabInvoice(1.8,15,serviceType.NORMAL);
		Assert.assertEquals(33.0, cabInvoice.calculateFare(),0.0);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnTotalFareForMultipleRides() {
		l1.add(new CabInvoice(1.8,15,serviceType.PREMIUM));
		l1.add(new CabInvoice(2,16,serviceType.NORMAL));
		l1.add(new CabInvoice(4,30,serviceType.NORMAL));
		CabInvoice cabInvoice = new CabInvoice();
		Assert.assertEquals(163.0,cabInvoice.calculateFareForMultipleRides(l1),0.0);
	}
	
	@Test
	public void enhancedInvoice() {
		l1.add(new CabInvoice(1.8,15,serviceType.PREMIUM));
		l1.add(new CabInvoice(2,16,serviceType.NORMAL));
		l1.add(new CabInvoice(4,30,serviceType.NORMAL));
		@SuppressWarnings("unused")
		CabInvoice cabInvoice = new CabInvoice();
		double arr[] = CabInvoice.enhancedInvoice(l1);
		Assert.assertEquals(3,(int)arr[0],0.0);
		Assert.assertEquals(163.0,arr[1],0.0);
		Assert.assertEquals(54.0,(int)arr[2],0.0);
	}
	
	@Test
	public void invoiceService() {
		// User - 1 
		l1.add(new CabInvoice(1.8,15,serviceType.PREMIUM));
		l1.add(new CabInvoice(2,16,serviceType.NORMAL));
		l1.add(new CabInvoice(4,30,serviceType.PREMIUM));
		repository.put("Devesh", l1);
		
		// User - 2 
		l1 = new ArrayList<>();
		l1.add(new CabInvoice(1.2,15,serviceType.NORMAL));
		l1.add(new CabInvoice(3,42.3,serviceType.PREMIUM));
		l1.add(new CabInvoice(1,10.2,serviceType.PREMIUM));
		repository.put("Venkat", l1);
		
		CabInvoice cabInvoice = new CabInvoice();
		cabInvoice.getUserInvoice(repository);
		
	}
	
	
	
	
	
}
