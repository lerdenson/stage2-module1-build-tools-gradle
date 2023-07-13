package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         try {
             if (str.matches("00.*")) return false;
             float a = Float.parseFloat(str);
             return a > 0;
         } catch (Exception e) {
             return false;
         }
    }
}
