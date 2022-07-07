package com.dufuna.berlin.maryOkosun.tax;

import com.dufuna.berlin.maryOkosun.tax.service.TaxService;
import com.dufuna.berlin.maryOkosun.tax.service.TaxServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a main class that runs the TaxCalculatorApp
 */
@SpringBootApplication
public class TaxCalculatorApp {
    /**
     * Creates a main class that runs the Spring boot application
     */
    public static void main(String[] args) {
        SpringApplication.run(TaxCalculatorApp.class, args);
    }

}
