package com.dufuna.berlin.maryOkosun.lekki.repository;

import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import com.dufuna.berlin.maryOkosun.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.maryOkosun.lekki.service.MockLekkiPropertyService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLekkiPropertyRepositoryImplTest {
    private SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Test
    void saveTest() {
        LekkiProperty property = new LekkiProperty(1,"Lagos", "Duplex" );
        LekkiProperty property2 = new LekkiProperty(2,"Ogun", "Bungalow" );

        repository.save(property);
        repository.save(property2);
        assertEquals(property2, repository.findById(2));
    }

    @Test
    void findByIdTest() {
        LekkiProperty property2 = new LekkiProperty(2,"Ogun", "Bungalow" );
        repository.save(property2);
        LekkiProperty actualProperty = repository.findById(2);
        assertEquals(property2, actualProperty);
    }

    @Test
    void findAllTest() {
        LekkiProperty property1 = new LekkiProperty(1,"Lagos", "Duplex" );
        LekkiProperty property2 = new LekkiProperty(2,"Ogun", "Flat" );
        LekkiProperty property3 = new LekkiProperty(3,"Imo", "Storey Building" );
        LekkiProperty property4 = new LekkiProperty(4,"Osun", "Bungalow" );

        repository.save(property1);
        repository.save(property2);
        repository.save(property3);
        repository.save(property4);

        List<LekkiProperty> list = new ArrayList<>();

        list.add(property1);
        list.add(property2);
        list.add(property3);
        list.add(property4);

        assertEquals(list, repository.findAll());
    }

    @Test
    void updateTest() {
        LekkiProperty property1 = new LekkiProperty(1,"Lagos","Duplex" );
        LekkiProperty property2 = new LekkiProperty(2,"Ogun","Flat" );
        LekkiProperty property3 = new LekkiProperty(3,"Imo","Storey Building" );
        LekkiProperty property4 = new LekkiProperty(4,"Niger", "Mini flat" );

        repository.save(property1);
        repository.save(property2);
        repository.save(property3);

        repository.update(1, property4);
        assertEquals(property4,repository.findById(1) );
    }
}