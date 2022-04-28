package com.uarbekov.string.medium;

public class LongestPalindrome {

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        String longest = "";
        if (s.length() == 1) {
            return s;
        }
        for (int i = 1; i < s.length(); i++) {
            String forLetter = findByLetter(s, i, 0);
            if (forLetter.length() > longest.length()) {
                longest = forLetter;
            }
            forLetter = findByPosition(s, i - 0.5f, 0.5f);
            if (forLetter.length() > longest.length()) {
                longest = forLetter;
            }
        }
        return longest;
    }
    public static String findByLetter(String s, int letterInter, int step) {
        if (letterInter - step >= 0 && s.length() > letterInter + step) {
            if (s.charAt(letterInter - step) == s.charAt(letterInter + step)) {
                return findByLetter(s, letterInter, step + 1);
            }
        }
        return s.substring(letterInter - step + 1, letterInter + step);
    }

    public static String findByPosition(String s, float letterInter, float step) {
        if ((int)letterInter - step >= 0 && s.length() > letterInter + step) {
            if (s.charAt((int)(letterInter - step)) == s.charAt((int)(letterInter + step))) {
                return findByPosition(s, letterInter, step + 1);
            }
        }
        return s.substring((int)(letterInter - step + 1), (int)(letterInter + step));
    }
}
