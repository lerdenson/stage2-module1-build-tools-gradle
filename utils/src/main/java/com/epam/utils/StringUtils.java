package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         try {
             int a = Integer.parseInt(str);
             return a > 0;
         } catch (Exception e) {
             return false;
         }
    }
}
