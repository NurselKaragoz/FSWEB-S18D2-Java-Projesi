package com.workintech.model.controller;

import com.workintech.model.entity.Fruit;
import com.workintech.model.services.FruitService;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/fruits")
public class FruitController {
    private FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Fruit save( @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @GetMapping("/")
    public List<Fruit> findAll(){
        return fruitService.findAll();
    }




    @GetMapping("/{id}")
    public List<Fruit> findById( @PathVariable long id){

        return fruitService.findAll();
    }


}
