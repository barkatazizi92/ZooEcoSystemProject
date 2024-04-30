package org.example.project;
/*
Check if Two Strings are Anagrams: Given two strings, determine if they
 are anagrams, meaning they contain the same characters in a different order.
 For example, "listen" and "silent" are anagrams.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class E5TwoStringAnagrams {
    public boolean anagrams(String a, String b) {
        char[] str1 = a.toLowerCase().toCharArray();
        char[] str2 = b.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        if (!Arrays.equals(str1, str2)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        E5TwoStringAnagrams e5TwoStringAnagrams = new E5TwoStringAnagrams();
        System.out.println(e5TwoStringAnagrams.anagrams("How", "wow"));
        System.out.println(e5TwoStringAnagrams.anagrams("listen", "silent"));


    }
}
