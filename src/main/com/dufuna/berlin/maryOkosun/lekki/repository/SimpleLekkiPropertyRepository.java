package com.dufuna.berlin.maryOkosun.lekki.repository;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;

import java.util.HashMap;
import java.util.List;


public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty lekkiProperty);
    LekkiProperty findById(int propertyId);
    List<LekkiProperty> findAll();
    void update(int propertyId, LekkiProperty lekkiProperty);
}

