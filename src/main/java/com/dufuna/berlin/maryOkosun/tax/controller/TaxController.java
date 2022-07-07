package com.dufuna.berlin.maryOkosun.tax.controller;

import com.dufuna.berlin.maryOkosun.tax.dto.TaxRequest;
import com.dufuna.berlin.maryOkosun.tax.service.TaxService;
import com.dufuna.berlin.maryOkosun.tax.service.TaxServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax")
public class TaxController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaxRequest calculateTax(@RequestBody TaxRequest taxRequest){
        TaxService service = new TaxServiceImpl();

        TaxRequest tax = TaxRequest.builder()
                .income(taxRequest.getIncome())
                .tax(service.calculateTax(taxRequest.getIncome()))
                .build();
        return tax;
    }
}
