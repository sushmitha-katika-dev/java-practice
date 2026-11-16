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
    public static void reverse(StringBuffer[] strb) {
        System.out.println(Arrays.toString(strb));
        for(int i = 0; i < strb.length; i++){
            strb[i].reverse();
        }
        System.out.println(Arrays.toString(strb));
        int left = 0, right = strb.length-1;
        while(left < right){
            StringBuffer temp = strb[left];
            strb[left] = strb[right];
            strb[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(strb));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);

        StringBuilder st = new StringBuilder("hello");
        st.reverse();

        System.out.println("\n" + st);
        StringBuffer[] stb = {new StringBuffer("hello"), new StringBuffer("hii")};
        reverse(stb);
    }
}