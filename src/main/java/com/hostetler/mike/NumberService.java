package com.hostetler.mike;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikeh on 7/15/16.
 */
@Service
public class NumberService {


    public Map<Integer, String> findNumbers() {

        Integer num = 1;
        HashMap<Integer, String> result = new HashMap<>();
        while (num <= FizzBuzzConstants.MAX) {
            StringBuilder sb = new StringBuilder();
            sb.append(num);

            result.put(num,sb.toString());
            num++;
        }

        return result;
    }
}
