package com.dufuna.berlin.maryOkosun.lekki;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import com.dufuna.berlin.maryOkosun.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.maryOkosun.lekki.service.MockLekkiPropertyService;

import java.util.Date;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        String[] propertyAddress = { "Lagos","Ibadan","Osun"};
        String[] propertyType = { "Duplex","Flat","Bungalow"};
        LekkiPropertyService service = new MockLekkiPropertyService();

        for (int i = 0; i < propertyAddress.length; i++) {
            LekkiProperty property = new LekkiProperty( i, propertyAddress[i], propertyType[i]);
            service.saveProperty(property);
            System.out.println(service.getProperty(i));
        }
        System.out.println(service.getProperties());
    }
}