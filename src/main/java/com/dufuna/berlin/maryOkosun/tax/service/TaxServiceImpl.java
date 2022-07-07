package com.dufuna.berlin.maryOkosun.tax.service;

import com.dufuna.berlin.maryOkosun.tax.model.TaxEntity;
import org.springframework.stereotype.Service;

@Service
public class TaxServiceImpl implements TaxService {
    private TaxEntity entity = new TaxEntity();
    @Override
    public double calculateTax(int income) {
        if (income < 0){
            throw new IllegalArgumentException("Income must be a positive integer");
        }
        if(income <= entity.BRACKET_UPPER_TWO ){
            return 0.0;
        }
        else if(income <= entity.BRACKET_UPPER_THREE ){
            double taxOwed = Math.round( (entity.BRACKET_UPPER_THREE - entity.BRACKET_LOWER_THREE) * entity.RATE_THREE);
            return taxOwed;
        }
        else if(income <= entity.BRACKET_UPPER_FOUR ){
            double taxOwed =Math.round( ((entity.BRACKET_UPPER_THREE - entity.BRACKET_LOWER_THREE) * entity.RATE_THREE)
                            + ((entity.BRACKET_UPPER_FOUR - entity.BRACKET_LOWER_FOUR) * entity.RATE_FOUR));
            return taxOwed;
        }
        double taxOwed =Math.round (((entity.BRACKET_UPPER_THREE - entity.BRACKET_LOWER_THREE) * entity.RATE_THREE)
                + ((entity.BRACKET_UPPER_FOUR - entity.BRACKET_LOWER_FOUR) * entity.RATE_FOUR));
        return taxOwed;
    }
}
