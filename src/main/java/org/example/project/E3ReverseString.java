package org.example.project;

public class E3ReverseString {
    // Reverse a String: Write a function to reverse a given string. For example,
    // given the input "Hello", the output should be "olleH"
    public static void main(String[] args) {
        String word = "Hello";
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String c = stringBuilder.toString();
        System.out.println(c);

    }
}
