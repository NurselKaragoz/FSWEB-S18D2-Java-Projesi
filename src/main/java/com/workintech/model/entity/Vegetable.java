package com.workintech.model.entity;

import jakarta.persistence.criteria.CriteriaBuilder;

public class Vegetable {
    private Long id;
    private String name;
    private Integer price;
    private Boolean isGrownOnTree;
}
