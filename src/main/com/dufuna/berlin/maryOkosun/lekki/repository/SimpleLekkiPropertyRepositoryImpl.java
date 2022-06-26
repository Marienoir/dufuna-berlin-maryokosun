package com.dufuna.berlin.maryOkosun.lekki.repository;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;

import java.util.HashMap;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    public HashMap<Integer, LekkiProperty> save(HashMap<Integer, LekkiProperty> trees) {
        System.out.println("Saved successfully : " + trees);
        return trees;
    }

    public LekkiProperty findById(int id, LekkiProperty lekkiProperty) {
        System.out.println("Single Property fetched: " + trees.get(id));
        return trees.get(id);
    }
    public HashMap<Integer, LekkiProperty> findAll(HashMap<Integer, LekkiProperty> trees)  {
        System.out.println("All property fetched successfully: " + trees);
        return trees;
    }
    public LekkiProperty update(int id, LekkiProperty lekkiProperty) {
        LekkiProperty updated = new LekkiProperty(1, "updatedProperty", "updatedAdddress");
        System.out.println("Property updated successfully : " + trees.get(updated.getPropertyId()));
        return updated;
    }

    public static void main(String[] args) {
        LekkiProperty property = new LekkiProperty(1,"Bungalow", "12 Chance Road, New York");
        LekkiProperty updatedProperty = new LekkiProperty(1,"Storey Building", "Canada");

        SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
//        propertyRepository.save(property);
        propertyRepository.findById(property.getPropertyId(), property);
//        propertyRepository.findAll(property);
        propertyRepository.update(1,updatedProperty);
    }
}
