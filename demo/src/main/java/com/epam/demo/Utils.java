package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String value : args) {
            if (!StringUtils.isPositiveNumber(value)) return false;
        }
        return true;
    }
}