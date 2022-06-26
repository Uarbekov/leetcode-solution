package com.uarbekov.array.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        int[] arrays = {1, 2 , 3};
//        int[] arrays = {9,8,7,6,5,4,3,2,1,0};
        int[] arrays = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(arrays)));
    }
//    public static int[] plusOne(int[] digits) {
//        long val = 0;
//        for (int i = 0; i < digits.length; i ++) {
//            val = val + (long)(digits[i] * Math.pow(10, digits.length - i - 1));
//        }
//        val++;
//        int length = String.valueOf(val).length();
//        int [] ret = new int[length];
//        for (int i = 0; i < length; i ++) {
//            double iter = Math.pow(10, length - 1 -i);
//            ret[i] = (int)(val / iter);
//            val = val - (long)iter * ret[i];
//        }
//        return ret;
//    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - i - 1] == 10) {
                if (digits.length - i - 1 != 0) {
                    digits[digits.length - i - 1] = 0;
                    digits[digits.length - i - 2] = digits[digits.length - i - 2] + 1;
                }
            }
        }
        if (digits[0] != 10) {
            return digits;
        } else {
            int [] ret = new int[digits.length + 1];
            ret [0] = 1;
            ret [1] = 0;
            for (int i = 1; i < digits.length; i++) {
                ret[i + 1] = digits[i];
            }
            return ret;
        }
    }
}
