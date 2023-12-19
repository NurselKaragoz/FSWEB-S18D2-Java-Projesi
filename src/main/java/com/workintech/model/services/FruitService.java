package com.workintech.model.services;

import com.workintech.model.entity.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FruitService {
    List<Fruit> findAll();
    Fruit findById(long id);
    Fruit save(Fruit fruit);

}
