package com.dufuna.berlin.maryOkosun.tax.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mary Okosun
 * @version 1.0
 * @since 1.0
 *
 */
@Data
@NoArgsConstructor
public class TaxEntity {

    public static final int BRACKET_LOWER_ONE = 0;
    public static final int BRACKET_UPPER_ONE = 18200;

    public static final int BRACKET_LOWER_TWO = 18201;
    public static final int BRACKET_UPPER_TWO = 37000;

    public static final int BRACKET_LOWER_THREE = 37001;
    public static final int BRACKET_UPPER_THREE = 90000;

    public static final int BRACKET_LOWER_FOUR = 90001;
    public static final int BRACKET_UPPER_FOUR = 180000;


    public static final double RATE_ONE = 0.0;
    public static final double RATE_TWO = 0.19;
    public static final double RATE_THREE = 0.325;
    public static final double RATE_FOUR = 0.37;
}
