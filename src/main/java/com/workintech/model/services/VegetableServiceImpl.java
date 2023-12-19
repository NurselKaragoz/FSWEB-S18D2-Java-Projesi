package com.workintech.model.services;

import com.workintech.model.dao.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class VegetableServiceImpl implements VegetableService {

    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }


}
