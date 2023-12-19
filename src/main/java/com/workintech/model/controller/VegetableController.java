package com.workintech.model.controller;

import com.workintech.model.entity.Fruit;
import com.workintech.model.entity.Vegetable;
import com.workintech.model.services.FruitService;
import com.workintech.model.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/vegetables")
public class VegetableController {
    private VegetableService vegetableService;
    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Vegetable save(@RequestBody Vegetable vegetabele){
        return vegetableService.save(vegetabele);
    }

    @GetMapping("/")
    public List<Vegetable> findAll(){
        return vegetableService.findAll();
    }




    @GetMapping("/{id}")
    public List<Vegetable> findById( @PathVariable long id){

        return vegetableService.findAll();
    }


}

