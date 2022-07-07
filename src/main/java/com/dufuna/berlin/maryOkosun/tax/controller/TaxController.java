package com.dufuna.berlin.maryOkosun.tax.controller;

import com.dufuna.berlin.maryOkosun.tax.dto.TaxRequest;
import com.dufuna.berlin.maryOkosun.tax.service.TaxService;
import com.dufuna.berlin.maryOkosun.tax.service.TaxServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax")
/**
 * Creates a TaxController class
 */
public class TaxController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * Creates a calculateTax that runs the TaxCalculatorApp
     * @params Accepts the tax request as a parameter
     * @return Returns a tax request
     */
    public TaxRequest calculateTax(@RequestBody TaxRequest taxRequest){
        TaxService service = new TaxServiceImpl();

        TaxRequest tax = TaxRequest.builder()
                .income(taxRequest.getIncome())
                .tax(service.calculateTax(taxRequest.getIncome()))
                .build();
        return tax;
    }
}
