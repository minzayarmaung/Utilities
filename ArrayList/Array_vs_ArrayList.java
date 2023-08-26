package CodingWithJohn.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_vs_ArrayList {
    public static void main(String[] args) {
        
    // Declaring Arrays
    String[] people = new String[4];
    String[] people1 = {"John","Mike","Gus","Jessie"};

    ArrayList<String> people2 = new ArrayList<>(Arrays.asList("Josh","Leo","Smith"));
    ArrayList<String> people3 = new ArrayList<>();

    //Adding Elements
    // You can't do that with Array
    people2.add("Micheal");

    //Getting Elements
    System.out.println(people1[2]);
    System.out.println(people2.get(2));

    //Getting Size
    System.out.println(people1.length);
    System.out.println(people2.size());

    //Removing Array
    // Can't do that in Array
    people2.remove(3);

    System.out.println(people2.size());
    }
}
