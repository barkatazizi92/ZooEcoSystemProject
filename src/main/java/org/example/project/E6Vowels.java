package org.example.project;

import javax.swing.plaf.IconUIResource;

/*
Create a method to count how many vowels are present in a string
 “documentation”
 */
public class E6Vowels {

    private static String vowel(String a) {
        String getA = a.replaceAll("[^AEIOUaeiou]", "");
        return getA;
    }

    public static void main(String[] args) {
        String vowels = vowel("How are you");
        int count = 0;
        for (int i = 0; i < vowels.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}

