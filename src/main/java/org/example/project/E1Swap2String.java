package org.example.project;

public class E1Swap2String {
    //Write a program to swap 2 String without a temporary variable?

    private String name = "Hamid";
    private String lastName = "Mahmood";

    public static void main(String[] args) {
        E1Swap2String swap = new E1Swap2String();
        String name1 = swap.name.replaceAll("Hamid", "Milad");
        String last1 = swap.lastName.replaceAll("Mahmood", "Khan");
        System.out.println(name1 + " " + last1);

    }
}

class Jan {
    public static void main(String[] args) {

//Write a program to swap 2 String with a temporary variable?
        String name = "Barkat";
        String lastName = "Milad";
        System.out.println("Name: " + name);
        System.out.println("LastName: " + lastName);

        System.out.println();

        String swap = name;
        name = lastName;
        lastName = swap;
        System.out.println("Name: " + name);
        System.out.println("LastName: " + lastName);


    }
}

