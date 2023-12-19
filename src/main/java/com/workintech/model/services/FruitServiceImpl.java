package com.workintech.model.services;

import com.workintech.model.dao.FruitRepository;
import com.workintech.model.dao.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FruitServiceImpl {
    private FruitRepository fruitRepository;
    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }
}
