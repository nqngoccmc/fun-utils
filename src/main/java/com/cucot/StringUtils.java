package com.cucot;

public class StringUtils {
    public static String nullTrim(String src) {
        if (src == null || src.trim().isBlank()) {
            return null;
        }
        return src.trim();
    }
}
