package com.hostetler.mike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by mikeh on 7/15/16.
 */
@Service
public class NumberManager {

    @Autowired
    NumberService numberService;

    @Autowired
    FizzService fizzService;

    @Autowired
    BuzzService buzzService;

    @Autowired
    FizzBuzzService fizzBuzzService;

    public String findResult() {
        Map<Integer, String> startingNumbers = numberService.findNumbers();

        Map<Integer,String> fizzNumbers = fizzService.findNumbers(startingNumbers);

        Map<Integer,String> buzzNumbers = buzzService.findNumbers(fizzNumbers);

        Map<Integer,String> fizzBuzzNumbers = fizzBuzzService.findNumbers(buzzNumbers);

        return getFinalValue(fizzBuzzNumbers);




    }

    private String getFinalValue(Map<Integer, String> startingNumbers) {
        List<Integer> numbers = new ArrayList<>(startingNumbers.keySet());
        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();

        for( Integer num: numbers) {

            sb.append(startingNumbers.get(num));
            if (num< FizzBuzzConstants.MAX) {
                sb.append(",");
            }


        }

        return sb.toString();
    }
}
