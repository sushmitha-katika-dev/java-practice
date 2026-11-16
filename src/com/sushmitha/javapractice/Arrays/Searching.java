package com.sushmitha.javapractice.Arrays;

import java.util.Arrays;

public class Searching {
    public static String searching(int[] nums, int k){
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == k){
                return "found";
            }
        }
        return "not found";
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 4;
        System.out.println(searching(nums, k));
    }
}
