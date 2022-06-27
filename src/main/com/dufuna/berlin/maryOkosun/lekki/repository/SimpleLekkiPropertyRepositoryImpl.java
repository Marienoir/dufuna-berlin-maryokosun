package com.dufuna.berlin.maryOkosun.lekki.repository;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    public Map<Integer, LekkiProperty> properties = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty lekkiProperty) {
        properties.put(lekkiProperty.getPropertyId(), lekkiProperty);
        return lekkiProperty;
    }

    public LekkiProperty findById(int propertyId) {
        for (Map.Entry<Integer, LekkiProperty> property :
                properties.entrySet()) {
           if (property.getKey() == propertyId){
               return property.getValue();
           }
        }
        return null;
    }
    public List<LekkiProperty> findAll()  {
        List<LekkiProperty> list = new ArrayList<LekkiProperty>(properties.values());
        return list;
    }
    public void update(int propertyId, LekkiProperty lekkiProperty) {
        for (Map.Entry<Integer, LekkiProperty> property :
                properties.entrySet()) {
            if (property.getKey() == propertyId){
              properties.put(propertyId, lekkiProperty);
            }
        }
    }
}
