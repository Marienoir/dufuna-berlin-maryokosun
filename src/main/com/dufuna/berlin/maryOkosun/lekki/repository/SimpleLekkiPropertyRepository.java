package com.dufuna.berlin.maryOkosun.lekki.repository;
import com.dufuna.berlin.maryOkosun.lekki.model.LekkiProperty;

import java.util.HashMap;


public interface SimpleLekkiPropertyRepository {
    HashMap<Integer, LekkiProperty> trees = new HashMap<>();
    HashMap<Integer, LekkiProperty> save(HashMap<Integer, LekkiProperty> trees);
    LekkiProperty findById(int id, LekkiProperty lekkiProperty);
    HashMap<Integer, LekkiProperty> findAll(HashMap<Integer, LekkiProperty> trees);
    LekkiProperty update(int id, LekkiProperty lekkiProperty);
}

