package com.dufuna.berlin.maryOkosun.tax.service;

import com.dufuna.berlin.maryOkosun.tax.TaxEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxService {
    public static double calculateTax(int taxBracket){
        TaxEntity taxEntity = new TaxEntity();
        if (taxBracket < taxEntity.getBracketOne()){
            double taxOwed = taxEntity.getBracketOne() * taxEntity.getRateOne();
            System.out.println("Tax bracket is "+ taxBracket + " and tax owed is " + taxOwed);
            return taxOwed;
        }
        if (taxBracket < taxEntity.getBracketTwo()){
            double taxOwed = (taxEntity.getBracketTwo() - taxEntity.getBracketOne()) * taxEntity.getRateTwo();
            System.out.println("Tax bracket is "+ taxBracket + " and tax owed is " + taxOwed);
            return taxOwed;
        }
        if (taxBracket < taxEntity.getBracketThree()){
            double previousTaxOwed = (taxEntity.getBracketTwo() - taxEntity.getBracketOne()) * taxEntity.getRateTwo();
            double taxOwed = previousTaxOwed + (taxEntity.getBracketThree() - taxEntity.getBracketTwo()) * taxEntity.getRateThree();
            System.out.println( "Tax bracket is "+ taxBracket + " and tax owed is " + taxOwed);
            return taxOwed;
        }
        //I have not gotten the logic in the below implementation yet
        if (taxBracket < taxEntity.getBracketFour()){
            double taxOwed = (taxEntity.getBracketFour() - taxEntity.getBracketThree()) * taxEntity.getRateFour();
            System.out.println("Tax bracket is "+ taxBracket + " and tax owed is " + taxOwed);
            return taxOwed;
        }
        double taxOwed = (taxBracket - taxEntity.getBracketFour()) * taxEntity.getRateFive();
        System.out.println("Tax bracket is "+ taxBracket + " and tax owed is " + taxOwed);
        return taxOwed;
    }

    public static void main(String[] args) {
        calculateTax(37000);
        SpringApplication.run(TaxService.class, args);
    }

}
