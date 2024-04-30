package org.example.project;


/*
Count the Number of Words in a String: Write a function to count the
 number of words in a given string. Words are separated by spaces or
 punctuation. For example, the input "Hello, world!" should return 2.
 */
public class E7NumberOfWord {

    public static void words(String a) {
        String[] howMany = a.split(",");
        System.out.println(howMany.length);
    }

    public static void main(String[] args) {
        words("How, are, you");
        words("Hello,world");
    }

}

class SecondWay {
    private String work = "Hard#Work";
    String[] hW = work.split("#");

    public static void main(String[] args) {
        SecondWay secondWay = new SecondWay();
        System.out.println(secondWay.hW.length);
    }
}

