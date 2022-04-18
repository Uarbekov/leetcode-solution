package com.uarbekov.string;

public class AddBinary {
    public static void main(String[] args) {
//        System.out.println(addBinary("11", "1"));
//        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
//        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("100", "110010"));


    }

    //
//    public static String addBinary(String a, String b) {
//        Long resultInt = Long.parseLong(a, 2) + Long.parseLong(b, 2);
//        return Long.toBinaryString(resultInt);
//    }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        String max, min;
        if (a.length() > b.length()) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        int buffer = 0;
        int maxIter = max.length();
        int minIter = min.length();
        for (int i = min.length() - 1; i != -1; i--) {
            maxIter--;
            minIter--;
            if (max.charAt(maxIter) == '1' && min.charAt(minIter) == '1') {
                if (buffer == 1) {
                    result.insert(0, 1);
                } else {
                    result.insert(0, 0);
                    buffer = 1;
                }
            } else if (max.charAt(maxIter) == '1' || min.charAt(minIter) == '1') {
                if (buffer == 1) {
                    result.insert(0, 0);
                } else {
                    result.insert(0, 1);
                }
            } else {
                if (buffer == 1) {
                    result.insert(0, 1);
                    buffer = 0;
                } else {
                    result.insert(0, 0);
                }
            }
        }
        if (max.length() > min.length()) {
            for (int i = max.length() - min.length() - 1; i != -1; i--) {
                if (max.charAt(i) == '1' && buffer == 1) {
                    result.insert(0, 0);
                } else if (max.charAt(i) == '0' && buffer == 1) {
                    result.insert(0, 1);
                    buffer = 0;
                } else if (max.charAt(i) == '0' && buffer == 0) {
                    result.insert(0, 0);
                } else if (max.charAt(i) == '1' && buffer == 0) {
                    result.insert(0, 1);
                }
            }
        }
        if (buffer == 1) {
            result.insert(0, buffer);
        }
        return result.toString();
    }
}