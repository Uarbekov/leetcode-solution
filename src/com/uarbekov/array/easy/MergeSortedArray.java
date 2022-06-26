package com.uarbekov.array.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = 0;
        for(int i = 0; i < nums1.length; i ++) {
            if (i1 == n) {
                break;
            }
            if (nums1[i] == 0) {
                nums1[i] = nums2[i1];
                i1 ++;
            }
        }
        int min;
        for (int i = 0; i < nums1.length; i ++) {
            min = nums1[i];
            for (int j = i; j < nums1.length; j ++) {
                if (min > nums1[j]) {
                    nums1[i] = nums1[j];
                    nums1[j] = min;
                    min = nums1[i];
                }
            }
        }
    }
}
