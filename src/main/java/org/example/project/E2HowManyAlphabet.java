package org.example.project;

public class E2HowManyAlphabet {
    //Find out how many alpha characters are present in a string
    public static void main(String[] args) {
        String alphabet = "How are you";
        int sum = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) != ' ') {
                sum++;
            }
        }
        System.out.println("Number of alphabets are = " + sum);
    }
}
