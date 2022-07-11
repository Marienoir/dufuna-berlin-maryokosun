package com.dufuna.berlin.maryOkosun.tax.controller;

import com.dufuna.berlin.maryOkosun.tax.dto.TaxRequest;
import com.dufuna.berlin.maryOkosun.tax.service.TaxService;
import com.dufuna.berlin.maryOkosun.tax.service.TaxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.annotation.security.RolesAllowed;

/**
 * Creates a TaxController class
 */

@RestController
@RequestMapping("/api/tax")
public class TaxController {
    @Autowired
    TaxService service = new TaxServiceImpl();

    /**
     * Creates a calculateTax that runs the TaxCalculatorApp
     * @params Accepts the tax request as a parameter
     * @return Returns a tax request
     */

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RolesAllowed("admin")

    public TaxRequest calculateTax(@RequestBody TaxRequest taxRequest){

        TaxRequest tax = TaxRequest.builder()
                .income(taxRequest.getIncome())
                .tax(service.calculateTax(taxRequest.getIncome()))
                .build();
        return tax;
    }
}
