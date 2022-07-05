package com.dufuna.berlin.maryOkosun.lekki.service;

import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockLekkiPropertyServiceTest {
    private LekkiPropertyService service = new MockLekkiPropertyService();
    @Test
    void saveProperty() {
        LekkiProperty property = new LekkiProperty(1,"Lagos", "Duplex" );
        service.saveProperty(property);

        assertEquals(property, service.getProperty(1));
        assertNotEquals(service.getProperty(2), service.getProperty(1));
    }

    @Test
    void getProperty() {
        LekkiProperty property = new LekkiProperty(1,"Lagos", "Duplex" );
        service.saveProperty(property);

        assertEquals(property, service.getProperty(1));
    }

    @Test
    void getProperties() {
        LekkiProperty property1 = new LekkiProperty(1,"Lagos", "Duplex" );
        LekkiProperty property2 = new LekkiProperty(2,"Ogun", "Flat" );
        LekkiProperty property3 = new LekkiProperty(3,"Imo", "Storey Building" );
        LekkiProperty property4 = new LekkiProperty(4,"Osun", "Bungalow" );

        service.saveProperty(property1);
        service.saveProperty(property2);
        service.saveProperty(property3);
        service.saveProperty(property4);
        List<LekkiProperty> list = new ArrayList<>();

        list.add(property1);
        list.add(property2);
        list.add(property3);
        list.add(property4);

        assertEquals(list, service.getProperties());
    }
}