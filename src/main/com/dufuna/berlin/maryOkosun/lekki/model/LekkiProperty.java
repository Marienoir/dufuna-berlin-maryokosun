package com.dufuna.berlin.maryOkosun.lekki.model;

import java.util.Date;
import java.util.Objects;
public class LekkiProperty {
    private String propertyAddress;
    private String propertyType;
    private int propertyId;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private Date validFrom;
    private Date validTo;

    public LekkiProperty(int propertyId, String propertyType, String propertyAddress) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.propertyAddress = propertyAddress;
    }

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
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getPropertyAddress() {
        return this.propertyAddress;
    }
    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    public int getNumberOfBedrooms() {
        return this.numberOfBedrooms;
    }
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public int getNumberOfSittingRooms() {
        return this.numberOfSittingRooms;
    }
    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }
    public int getNumberOfKitchens() {
        return this.numberOfKitchens;
    }
    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }
    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }
    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public int getNumberOfToilets() {
        return this.numberOfToilets;
    }
    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }
    public String getPropertyOwner() {
        return this.propertyOwner;
    }
    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getValidFrom() {
        return this.validFrom;
    }
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }
    public Date getValidTo() {
        return this.validTo;
    }
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public static void main(String[] args) {
        LekkiProperty l1 = new LekkiProperty(1,"Bungalow","New York City" );
        System.out.println(l1.toString());
        System.out.println((l1.equals(l1)));
        System.out.println(l1.hashCode());
    }
}
