package com.bridgelabz.cabinvoicegenerator;

import org.junit.Test;

import org.junit.Assert;

public class CabInvoiceTest {
	
	@Test
	public void shouldReturnTotalFare() {
		CabInvoice cabInvoice = new CabInvoice();
		Assert.assertEquals(33.0, cabInvoice.calculateFare(1.8,15),0.0);
	}
}
