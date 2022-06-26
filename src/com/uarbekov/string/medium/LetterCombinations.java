package com.uarbekov.string.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("234"));

    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        String[] two = {"a", "b", "c"};
        String[] three = {"d", "e", "f"};
        String[] four = {"g", "h", "i"};
        String[] five = {"j", "k", "l"};
        String[] six = {"m", "n", "o"};
        String[] seven = {"p", "q", "r", "s"};
        String[] eight = {"t", "u", "v"};
        String[] nine = {"x", "w", "y", "z"};

        List<String []> digitList = new LinkedList<>();
        for (char c : digits.toCharArray()) {
            switch (c) {
                case '2':
                    digitList.add(two);
                    break;
                case '3':
                    digitList.add(three);
                    break;
                case '4':
                    digitList.add(four);
                    break;
                case '5':
                    digitList.add(five);
                    break;
                case '6':
                    digitList.add(six);
                    break;
                case '7':
                    digitList.add(seven);
                    break;
                case '8':
                    digitList.add(eight);
                    break;
                case '9':
                    digitList.add(nine);
                    break;
            }
        }
        List<String> result = new ArrayList<>();
        letterCombinations(digitList, result, "", 1);

        return result;
    }
    public static void letterCombinations(List<String []> digitList, List<String> result, String prevLetters, int pointerDepth) {
        if (pointerDepth == digitList.size()) {
            for (String letter : digitList.get(pointerDepth - 1)) {
                result.add(prevLetters + letter);
            }
        } else {
            for (String letter : digitList.get(pointerDepth - 1)) {
                letterCombinations(digitList, result, prevLetters + letter, pointerDepth + 1);
            }
        }
    }



    }
