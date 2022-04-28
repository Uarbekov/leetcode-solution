package com.uarbekov.string.easy;

public class ConvertToTitle {

    static String[] letters = {"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {
//        System.out.println(convertToTitle(1));
//        System.out.println(convertToTitle(2147483647));
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        return convertToTitleRec(columnNumber, 0);
    }
    public static String convertToTitleRec(int columnNumber, int times) {
        if (columnNumber <= Math.pow(26, times + 1)) {
//        if (Math.pow(26, times) <= columnNumber && columnNumber <= Math.pow(26, times + 1)) {
            String result = "";
            for (int i = 0; i <= times; i ++) {
                if(columnNumber >= Math.pow(26,times - i)) {
                    result = result.concat(letters[(columnNumber/(int)Math.pow(26,times - i)) - 1]);
                }
                columnNumber = columnNumber%(int)Math.pow(26,times - i);
            }
            return result;
        }
        return convertToTitleRec(columnNumber, times + 1);
    }

    }
