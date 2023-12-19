package com.workintech.model.services;

import com.workintech.model.dao.VegetableRepository;
import com.workintech.model.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VegetableServiceImpl implements VegetableService {

    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }


    @Override
    public List<Vegetable> findAll() {
        return null;
    }

    @Override
    public Vegetable findById(long id) {
        return null;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return null;
    }
}
