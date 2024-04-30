package org.example.project;

import java.util.ArrayList;
import java.util.List;

/*
Find the First Non-Repeating Character in a String: Given a string, find and
 return the first non-repeating character. For example, in the string
 "abracadabra", the first non-repeating character is 'c'
 */
public class E9NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abracadabra";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("The first non-repeating character is: " + ch);
                break;
            }
        }
    }
}

class Non {
    public static void main(String[] args) {

        String school = "Sharifi High School";

        for (int i = 0; i < school.length(); i++) {
            int count = 0;
            for (int j = 0; j < school.length(); j++) {
                if (school.charAt(i) == school.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(school.charAt(i));
                break;
            }
        }

    }
}
