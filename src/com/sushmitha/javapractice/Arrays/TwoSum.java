package com.sushmitha.javapractice.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void twoSum(int[] nums, int k){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == k){
                    int[] a = {i,j};
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,5,7,3};
        int target = 5;
        twoSum(arr, target);

    }
}
