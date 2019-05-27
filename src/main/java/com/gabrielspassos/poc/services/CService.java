package com.gabrielspassos.poc.services;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class CService {

    private static final int MAX_RANDOM_NUMBER = 4;
    private static final int MIN_RANDOM_NUMBER = 1;

    public Integer getRandomEvenNumber() {
        Integer randomNumber = getRandomNumber();
        return Optional.of(randomNumber)
                .filter(this::numberIsEven)
                .orElseThrow(IllegalArgumentException::new);
    }

    private Integer getRandomNumber() {
        return new Random().nextInt((MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 1) + MIN_RANDOM_NUMBER;
    }

    private Boolean numberIsEven(Integer number) {
        return number % 2 == 0;
    }
}
