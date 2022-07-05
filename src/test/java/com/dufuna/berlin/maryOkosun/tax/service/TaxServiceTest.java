package com.dufuna.berlin.maryOkosun.tax.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.dufuna.berlin.maryOkosun.tax.service.TaxService.calculateTax;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaxServiceTest {

    @Test
    void taxBracketLessThan18201EqualZeroTest() {
        double actualTax = calculateTax(18200);
        assertEquals(0, actualTax);
    }
    @Test
    void taxBracketLessThan37001Test() {
        double actualTax = calculateTax(37000);
        assertEquals(3572.0, actualTax);
    }
    @Test
    void taxBracketLessThan90001Test() {
        double actualTax = calculateTax(90000);
        assertEquals(20797.0, actualTax);
    }
    @Test
    void taxBracketLessThan180001Test() {
        double actualTax = calculateTax(180000);
        assertEquals(54096, actualTax);
    }
    @Test
    void taxBracketEqualTo180001Test() {
        double actualTax = calculateTax(180001);
        assertEquals(0, actualTax);
    }
}