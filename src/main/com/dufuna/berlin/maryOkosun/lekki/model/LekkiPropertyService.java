package com.dufuna.berlin.maryOkosun.lekki.model;

import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.HashMap;

interface LekkiPropertyService {
    public void saveProperty(LekkiProperty LekkiProperty);
    public void getProperty();

    class LekkiPropertyRepository {
        LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
            SimpleLekkiPropertyRepository saveProp = new SimpleLekkiPropertyRepository() {
                @Override
                public HashMap<Integer, LekkiProperty> save(HashMap<Integer, LekkiProperty> trees) {
                    return null;
                }

                @Override
                public LekkiProperty findById(int id, LekkiProperty lekkiProperty) {
                    return null;
                }

                @Override
                public HashMap<Integer, LekkiProperty> findAll(HashMap<Integer, LekkiProperty> trees)  {
                    return null;
                }

                @Override
                public LekkiProperty update(int id, LekkiProperty lekkiProperty) {
                    return lekkiProperty;
                }
            };
            return lekkiProperty;
        };
    }
    static void main(String[] args) {
        LekkiProperty property = new LekkiProperty(1,"Bungalow", "Ondo State");
        LekkiProperty property1 = new LekkiProperty(1,"Bungalow", "Lagos State");

        SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
//        propertyRepository.save(property);
        propertyRepository.findById(property.getPropertyId(), property);
//        propertyRepository.findAll(property);
        propertyRepository.update(1,property1);
    }
}





