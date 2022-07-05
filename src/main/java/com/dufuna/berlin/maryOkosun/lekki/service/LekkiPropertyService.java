package com.dufuna.berlin.maryOkosun.lekki.service;

import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;

import java.util.List;
import java.util.Stack;

public interface LekkiPropertyService {
    public void saveProperty(LekkiProperty LekkiProperty);
    public LekkiProperty getProperty(int propertyId);
    List<LekkiProperty> getProperties();
}





