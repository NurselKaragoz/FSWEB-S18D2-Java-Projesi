package com.workintech.model.services;

import com.workintech.model.dao.FruitRepository;
import com.workintech.model.dao.VegetableRepository;
import com.workintech.model.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FruitServiceImpl implements FruitService {
    private FruitRepository fruitRepository;
    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> findAll() {
        return null;
    }

    @Override
    public Fruit findById(long id) {
        return null;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return null;
    }
}
