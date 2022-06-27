package com.dufuna.berlin.maryOkosun.lekki.model;

import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {
    SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
    public void saveProperty(LekkiProperty LekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " called");
        propertyRepository.save(LekkiProperty);
    }

    public LekkiProperty getProperty(int propertyId) {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " called");
        return propertyRepository.findById(propertyId);
    }

    @Override
    public List<LekkiProperty> getAllProperties() {
        return propertyRepository.findAll();
    }
}
