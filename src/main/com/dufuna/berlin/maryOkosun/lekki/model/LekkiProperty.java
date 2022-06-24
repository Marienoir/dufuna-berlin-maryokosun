package com.dufuna.berlin.maryOkosun.lekki.model;

import java.util.Objects;
public class LekkiProperty {
    String propertyAddress = "12 Chance Road Canada";
    String propertyType = "Bungalow";
    int propertyId = 1;
    int numberOfBedrooms;
    int numberOfSittingRooms;
    int numberOfKitchens;
    int numberOfBathrooms;
    int numberOfToilets;
    String propertyOwner;
    String description;
    String validFrom;
    String validTo;

    @Override
    public String toString() {
        return "LekkiProperty { " +
                "propertyAddress = '" + propertyAddress + '\'' +
                ", propertyType = '" + propertyType + '\'' +
                ", propertyId = " + propertyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty)) return false;
        LekkiProperty that = (LekkiProperty) o;
        return getPropertyId() == that.getPropertyId() && getNumberOfBedrooms() == that.getNumberOfBedrooms() && getNumberOfSittingRooms() == that.getNumberOfSittingRooms() && getNumberOfKitchens() == that.getNumberOfKitchens() && getNumberOfBathrooms() == that.getNumberOfBathrooms() && getNumberOfToilets() == that.getNumberOfToilets() && Objects.equals(getPropertyAddress(), that.getPropertyAddress()) && Objects.equals(getPropertyType(), that.getPropertyType()) && Objects.equals(getPropertyOwner(), that.getPropertyOwner()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getValidFrom(), that.getValidFrom()) && Objects.equals(getValidTo(), that.getValidTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyId());
    }
    public int getPropertyId() {
        return propertyId;
    }
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyType() {
        return this.propertyType;
    }
    // Setter
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    // Getter
    public String getPropertyAddress() {
        return this.propertyAddress;
    }
    // Setter
    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    public int getNumberOfBedrooms() {
        return this.numberOfBedrooms;
    }
    // Setter
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public int getNumberOfSittingRooms() {
        return this.numberOfSittingRooms;
    }
    // Setter
    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }
    public int getNumberOfKitchens() {
        return this.numberOfKitchens;
    }
    // Setter
    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }
    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }
    // Setter
    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public int getNumberOfToilets() {
        return this.numberOfToilets;
    }
    // Setter
    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }
    public String getPropertyOwner() {
        return this.propertyOwner;
    }
    // Setter
    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }
    public String getDescription() {
        return this.description;
    }
    // Setter
    public void setDescription(String description) {
        this.description = description;
    }
    // Getter
    public String getValidFrom() {
        return this.validFrom;
    }
    // Setter
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
    // Getter
    public String getValidTo() {
        return this.validTo;
    }
    // Setter
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public static void main(String[] args) {
        LekkiProperty l1 = new LekkiProperty();
        l1.setPropertyId(1);
        l1.setPropertyAddress("12,Goodness Estate, Canada");
        l1.setPropertyType("Bungalow");
        System.out.println(l1.toString());
        System.out.println((l1.equals(l1)));
        System.out.println(l1.hashCode());
    }
}
