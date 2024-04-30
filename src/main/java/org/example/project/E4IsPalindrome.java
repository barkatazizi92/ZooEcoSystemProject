package org.example.project;

/*
Check if a String is Palindrome: Determine whether a given string is a
 palindrome, which means it reads the same forwards and backward. For
 example, "madam" is a palindrome.
 */
public class E4IsPalindrome {
    public static void main(String[] args) {
        String words = "aba";
        StringBuilder stringBuilder = new StringBuilder(words);

        stringBuilder.reverse();
        String convert = stringBuilder.toString();
        if (words.equals(convert)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
