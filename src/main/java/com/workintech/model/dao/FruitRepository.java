package com.workintech.model.dao;

import com.workintech.model.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Fruit> findAllByOrderByPriceDesc();

    @Query("SELECT f FROM Vegetable f ORDER BY f.price ASC")
    List<Fruit> findAllByOrderByPriceAsc();

    @Query("SELECT f FROM Vegetable f WHERE f.name ILIKE %:name%")
    List<Fruit> findByNameContaining(String name);

}
