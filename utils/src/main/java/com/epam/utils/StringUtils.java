package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         try {
             float a = Float.parseFloat(str);
             return a > 0;
         } catch (Exception e) {
             return false;
         }
    }
}
