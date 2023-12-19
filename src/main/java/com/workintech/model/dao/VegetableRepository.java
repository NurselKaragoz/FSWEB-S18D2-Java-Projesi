package com.workintech.model.dao;

import com.workintech.model.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query("SELECT v FROM Vegetable v ORDER BY v.price DESC")
    List<Vegetable> findAllByOrderByPriceDesc();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price ASC")
    List<Vegetable> findAllByOrderByPriceAsc();

    @Query("SELECT v FROM Vegetable v WHERE v.name ILIKE %:name%")
    List<Vegetable> findByNameContaining(String name);
}