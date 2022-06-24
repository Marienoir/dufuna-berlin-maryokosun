package com.dufuna.berlin.maryOkosun.lekki;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import com.dufuna.berlin.maryOkosun.lekki.model.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty property1 = new LekkiProperty();
        property1.setPropertyId(1);
        property1.setPropertyAddress("12,Chance Road,New York");
        property1.setPropertyType("Story Building");
        property1.setDescription("This is a beautiful apartment");
        property1.setNumberOfBathrooms(3);
        property1.setNumberOfBedrooms(5);
        property1.setPropertyOwner("Mary Okosun");
        property1.setNumberOfKitchens(1);
        property1.setNumberOfSittingRooms(5);
        property1.setNumberOfToilets(3);
        property1.setValidFrom("12/10/2022");
        property1.setValidTo("29/12/2023");
        System.out.println("Property created successfully");

        MockLekkiPropertyService myProperty = new MockLekkiPropertyService();
        myProperty.saveProperty(property1);
        myProperty.getProperty();
    }
}
