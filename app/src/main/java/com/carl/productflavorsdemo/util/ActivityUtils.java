package com.carl.productflavorsdemo.util;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/7
 */
public class ActivityUtils {
    public static boolean isExist(String className) {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
