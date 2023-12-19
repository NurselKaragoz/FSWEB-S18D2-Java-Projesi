package com.workintech.model.exceptions;

import com.workintech.model.entity.Fruit;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class FruitException extends RuntimeException{
    private HttpStatus httpStatus;

    public FruitException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
