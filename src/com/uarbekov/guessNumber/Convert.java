package com.uarbekov.guessNumber;

import java.util.HashMap;
import java.util.List;

public class Convert {

    public String convert(String s, int numRows) {
        return null;

    }

    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> cities = new HashMap<>();
        String dest = "";
        for(List<String> list : paths) {

            dest = list.get(1);
        }

        return dest;
    }
}
