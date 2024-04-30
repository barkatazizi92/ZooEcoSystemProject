package org.example.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
You have a list of strings and you want to keep only those that start with
 “A” and you want to return them in lower case".
 */
public class E10RemoveDuplicateFromArray {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Ananias");
        fruit.add("Grape fruit");
        fruit.add("Orange");
        fruit.add("Ananias");
        fruit.add("Grape fruit");

        Set<String> duplicate = new HashSet<>(fruit);
        System.out.println(duplicate);


        duplicate.forEach(x -> System.out.println(x));
        System.out.println();

    }
}
