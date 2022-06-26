package com.dufuna.berlin.maryOkosun.lekki;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;
import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.Date;

import static com.dufuna.berlin.maryOkosun.lekki.repository.SimpleLekkiPropertyRepository.trees;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        String[] typeArr = new String[]{ "Bungalow","Duplex","Storey Building" };
        String[] addressArr = new String[]{ "Lagos","Canada","New York" };
        for (int i = 0; i < typeArr.length; i = i + 1) {
            LekkiProperty property1 = new LekkiProperty(i+1, typeArr[i], addressArr[i]);
            property1.setDescription("This is a beautiful apartment");
            property1.setNumberOfBathrooms(3);
            property1.setNumberOfBedrooms(5);
            property1.setPropertyOwner("Mary Okosun");
            property1.setNumberOfKitchens(1);
            property1.setNumberOfSittingRooms(5);
            property1.setNumberOfToilets(3);
            property1.setValidFrom(new Date(2022, 11, 21));
            property1.setValidTo(new Date(2023, 12, 11));
            System.out.println("Property created successfully : " + property1);
            trees.put(i+1, property1);

        }
        LekkiProperty property = new LekkiProperty(1,"Bungalow", "12 Chance Road, New York");
        LekkiProperty updatedProperty = new LekkiProperty(1,"Storey Building", "Canada");

        SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
        propertyRepository.save(trees);
        propertyRepository.findById(3, property);
        propertyRepository.findAll(trees);
        propertyRepository.update(1,updatedProperty);
    }
}