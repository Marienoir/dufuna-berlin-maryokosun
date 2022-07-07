package com.dufuna.berlin.maryOkosun.tax.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/**
 * Creates a TaxRequest class that accepts two variables
 */
public class TaxRequest {
    private int income;
    private double tax;
}
