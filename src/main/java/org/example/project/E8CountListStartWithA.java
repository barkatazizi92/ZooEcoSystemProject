package org.example.project;
/*
You have a list of strings and you want to keep only those that start with
 “A” and you want to return them in lower case".
 */

import java.util.ArrayList;
import java.util.List;

public class E8CountListStartWithA {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Afghanistan");
        countries.add("Jaghori");
        countries.add("Hotqul");
        countries.add("AghilBayo");

        countries.removeIf(x -> x.charAt(0) != 'A');
        String country = countries.toString().toLowerCase();
        System.out.println(country);
    }
}




