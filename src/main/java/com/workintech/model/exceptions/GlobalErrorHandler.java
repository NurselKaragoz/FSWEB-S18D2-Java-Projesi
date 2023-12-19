package com.workintech.model.exceptions;

import com.workintech.model.entity.Fruit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(FruitException fruitException){
        ErrorResponse errorResponse = new ErrorResponse(fruitException.getMessage());
        return new ResponseEntity<>(errorResponse, fruitException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(VegetableException vegetableException){
        ErrorResponse errorResponse = new ErrorResponse(vegetableException.getMessage());
        return new ResponseEntity<>(errorResponse, vegetableException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception exception){
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}


