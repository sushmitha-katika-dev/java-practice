package com.sushmitha.javapractice.Arrays;

import java.util.Arrays;
public class ReversePointers {
    public static void reverse(int[] arr){
        int left = 0, right = arr.length-1;

        while(left <=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        StringBuilder st = new StringBuilder("hello");
        st.reverse();
        System.out.println("\n" + st);
    }
}