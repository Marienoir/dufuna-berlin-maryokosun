package com.dufuna.berlin.maryOkosun.tax;

import com.dufuna.berlin.maryOkosun.tax.service.TaxService;
import com.dufuna.berlin.maryOkosun.tax.service.TaxServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class TaxCalculatorApp {
    public static void main(String[] args) {
        TaxService service = new TaxServiceImpl();
        service.calculateTax(37000);
        service.calculateTax(90000);
        service.calculateTax(180000);
        SpringApplication.run(TaxCalculatorApp.class, args);
    }

}
