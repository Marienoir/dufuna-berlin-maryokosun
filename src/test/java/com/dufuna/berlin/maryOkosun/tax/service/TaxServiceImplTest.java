package com.dufuna.berlin.maryOkosun.tax.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxServiceImplTest {
TaxService service = new TaxServiceImpl();

    @Test
    void IncomeLessThan0ThrowsError() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                service.calculateTax(-9);
            });
    }
    @Test
    void IncomeEquals37000Equals0() {
        double tax = service.calculateTax(37000);
        assertEquals(0.00,tax);
    }
    @Test
    void IncomeEquals90000Equals17224() {
        double tax = service.calculateTax(90000);
        assertEquals(17225.0,tax);
    }
    @Test
    void IncomeEquals180000Equals50524() {
        double tax = service.calculateTax(180000);
        assertEquals(50524.0,tax);
    }

    @Test
    void IncomeLessThan37000Equals0() {
        double tax = service.calculateTax(36000);
        assertEquals(0.00,tax);
    }
    @Test
    void IncomeLessThan90000Equals17225() {
        double tax = service.calculateTax(80000);
        assertEquals(17225.0,tax);
    }
    @Test
    void IncomeLessThan180000Equals50524() {
        double tax = service.calculateTax(170000);
        assertEquals(50524.0,tax);
    }

    @Test
    void IncomeGreaterThan37000Equals17224() {
        double tax = service.calculateTax(37500);
        assertEquals(17225.0,tax);
    }
    @Test
    void IncomeGreaterThan90000Equals50524() {
        double tax = service.calculateTax(90500);
        assertEquals(50524.0,tax);
    }
    @Test
    void IncomeGreaterThan180000Equals50524() {
        double tax = service.calculateTax(200500);
        assertEquals(50524.0,tax);
    }
}