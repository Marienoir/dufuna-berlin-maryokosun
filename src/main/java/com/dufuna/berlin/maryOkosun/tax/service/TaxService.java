package com.dufuna.berlin.maryOkosun.tax.service;

public interface TaxService {
    /**
     * Interface for tax service
     *
     * @param income Accepts the income parameter
     * @return Returns the calculated tax which is a double
     * */
    double calculateTax(int income);
}