package com.hostetler.mike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikeh on 7/15/16.
 */
@Service
public class FizzBuzzService {

    @Autowired
    DividerService dividerService;

    public Map<Integer, String> findNumbers(Map<Integer, String> numberMap) {

        Map<Integer,String> result = new HashMap<>();
        for(Integer num: numberMap.keySet()) {

            if (dividerService.isEven(5, num) && dividerService.isEven(3, num)) {
                result.put(num,FizzBuzzConstants.FIZZBUZZ);


            }else {
                result.put(num,numberMap.get(num));

            }
        }

        return result;

    }
}
