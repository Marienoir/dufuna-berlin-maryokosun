package com.dufuna.berlin.maryOkosun.lekki;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import com.dufuna.berlin.maryOkosun.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.maryOkosun.lekki.service.MockLekkiPropertyService;

import java.util.Date;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
    LekkiProperty property1 =  new LekkiProperty(1, "Flat", "Lagos",
            2, 2, 3, 2, 3,
            "John", "Expensive taste", new Date(10/10/2021), new Date(12/12/2023));
    LekkiProperty property2 =  new LekkiProperty(2, "Bungalow", "Ibadan",
            5, 8, 2, 1, 7,
            "Doe", "Wonderful apartment", new Date(10/10/2021), new Date(12/12/2023));
    LekkiProperty property3 =  new LekkiProperty(3, "Duplex", "Osun",
            3, 7, 8, 4, 4,
            "Michael", "Beautiful apartment", new Date(10/10/2021), new Date(12/12/2023));

    LekkiPropertyService service = new MockLekkiPropertyService();
    service.saveProperty(property1);
    service.saveProperty(property2);
    service.saveProperty(property3);

        //Get a LekkiProperty using LekkiPropertyService and print it to console
    System.out.println(service.getProperty(property1.getPropertyId()));

        //Gets multiple LekkiProperty Objects and print it to the console.
    System.out.println(service.getProperties());
    }
}