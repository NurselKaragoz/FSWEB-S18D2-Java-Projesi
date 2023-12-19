package com.workintech.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vegetable", schema = "fsweb")
public class Fruit {
    @Id
    @GeneratedValue
    private Long id;
    private String Name;
    FruitType fruitType;

}
