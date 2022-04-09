package com.uarbekov.week1;

public class CandiesForChildren {
    public static void main(String[] args) {
        int[] candies = {5, 8, 6};
        System.out.println(maximumCandies(candies, 3));
        ;
    }

//    public static int maximumCandies(int[] candies, long k) {
//        int minCandies = candies[0];
//        int eachChildCandy = 0;
//        for (int candy : candies) {
//            if (minCandies > candy) {
//                minCandies = candy;
//            }
//        }
//        if (minCandies < k) {
//            return 0;
//        }
//        return minCandies;
//    }

    public static int maximumCandies(int[] candies, long k) {
        int eachChildCandy = 0;
        for (int candy : candies) {
            int candyS = (int) ((long) candy / k);
            eachChildCandy = eachChildCandy + candyS;
        }
        return eachChildCandy;
    }

}
