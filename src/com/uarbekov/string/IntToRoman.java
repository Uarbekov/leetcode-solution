package com.uarbekov.string;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }

    public static String intToRoman(int num) {

        num = checkAndAdd(num, 1000, 900, "M",  "CM");
        num = checkAndAdd(num, 500, 400, "D",  "CD");
        num = checkAndAdd(num, 100, 90, "C",  "XC");
        num = checkAndAdd(num, 50, 40, "L",  "XL");
        num = checkAndAdd(num, 10, 9, "X",  "IX");
        num = checkAndAdd(num, 5, 4, "V",  "IV");
        checkAndAdd(num, 1, 0, "I",  null);
        return result.toString();
    }

    public static int checkAndAdd(int num, int dec, int prevDec, String strDec, String strPrevDec) {
        if (dec == 1) {
            for (int i = 0; i < num; i++) {
                result.append(strDec);
            }
            return 0;
        }
        if (num / dec > 0) {
            int times = num / dec;
            for (int i = 0; i < times; i++) {
                result.append(strDec);
            }
            num = num % dec;
        }
        if (num - prevDec >= 0) {
            result.append(strPrevDec);
            num = num - prevDec;
        }
        return num;
    }
}