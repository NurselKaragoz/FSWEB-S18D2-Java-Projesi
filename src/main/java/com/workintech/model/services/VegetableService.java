package com.workintech.model.services;

import com.workintech.model.entity.Fruit;
import com.workintech.model.entity.Vegetable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VegetableService {
    List<Vegetable> findAll();
   Vegetable findById(long id);
   Vegetable save(Vegetable vegetable);
}
