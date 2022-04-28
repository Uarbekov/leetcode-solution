package com.uarbekov.string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstWord = new HashMap<>();
        for (char c : s.toCharArray()) {
            firstWord.put(c, firstWord.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> secondWord = new HashMap<>();
        for (char c : t.toCharArray()) {
            secondWord.put(c, secondWord.getOrDefault(c, 0) + 1);
        }
        if (firstWord.keySet().equals(secondWord.keySet())) {
            for (char c : firstWord.keySet()) {
                if (!firstWord.get(c).equals(secondWord.get(c))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
