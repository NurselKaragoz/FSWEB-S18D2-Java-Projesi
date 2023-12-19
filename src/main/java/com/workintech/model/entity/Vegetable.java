package com.workintech.model.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fruit", schema = "fsweb")
public class Vegetable {
    @Id
    @Column(name = "id")
    @GeneratedValue
    @NotNull
    private Long id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "price")
    @Min(20)
    private Integer price;
    @Column(name = "grownOnTree")
    private Boolean isGrownOnTree;
}
