package com.sushmitha.javapractice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
