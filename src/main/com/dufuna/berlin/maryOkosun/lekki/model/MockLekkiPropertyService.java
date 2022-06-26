package com.dufuna.berlin.maryOkosun.lekki.model;

public class MockLekkiPropertyService implements LekkiPropertyService {
    public void saveProperty(LekkiProperty LekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
    }

    public void getProperty() {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
    }

    public static void main(String[] args) {
        LekkiProperty newProperty = new LekkiProperty(1, "Storey Building", "Lagos");
        MockLekkiPropertyService mockService = new MockLekkiPropertyService();
        mockService.saveProperty(newProperty);
        mockService.getProperty();
    }
}
