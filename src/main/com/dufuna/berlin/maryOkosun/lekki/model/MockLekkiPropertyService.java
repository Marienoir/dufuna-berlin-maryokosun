package com.dufuna.berlin.maryOkosun.lekki.model;

public class MockLekkiPropertyService implements LekkiPropertyService {
    public LekkiProperty saveProperty(LekkiProperty LekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
        LekkiProperty houseObject;
        houseObject = new LekkiProperty();
        houseObject.propertyAddress = LekkiProperty.getPropertyAddress();
        houseObject.propertyType = LekkiProperty.getPropertyType();
        houseObject.propertyId = LekkiProperty.getPropertyId();
        System.out.println("Property saved successfully " );
        return null;
    }

    @Override
    public String saveProperty(String LekkiProperty) {
        return null;
    }

    public LekkiProperty getProperty() {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
        LekkiProperty LekkiProperty = new LekkiProperty();
        System.out.println(LekkiProperty);
        return LekkiProperty;
    }
}
