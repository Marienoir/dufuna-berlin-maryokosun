package com.dufuna.berlin.maryOkosun.lekki.model;

import java.util.List;

public interface LekkiPropertyService {
    public void saveProperty(LekkiProperty LekkiProperty);
    public LekkiProperty getProperty(int propertyId);
    List<LekkiProperty> getAllProperties();
}





