package com.uarbekov.string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (alphabet.containsKey(s.charAt(i))) {
                if (alphabet.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (alphabet.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    alphabet.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }
}
