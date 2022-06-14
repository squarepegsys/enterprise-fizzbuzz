package com.hostetler.mike;

import org.springframework.stereotype.Service;

/**
 * Created by mikeh on 7/15/16.
 */
@Service
public class DividerService {
    public boolean isEven(int i, Integer num) {
        return num%i==0;
    }
}
