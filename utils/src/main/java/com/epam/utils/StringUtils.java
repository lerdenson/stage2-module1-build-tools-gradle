package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         if (str.matches("-?[0-9]+(\\.[0-9]+)?")) {
             return !str.matches("-.*") && !str.matches("^0+$");
         }
         return false;
    }
}
