package CodingWithJohn.Maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetAndHashSet{
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jessie");
        names.add("Skyler");
        names.add("Mike");
        names.add("Walter"); // Only Appear once !

        System.out.println(names);
        // Print out No in Order
        names.remove("Jessie");
        names.remove(2);    // Cant remove via Index Number
        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("Mike"));
        System.out.println(names.isEmpty());
        
        System.out.println(); 

        // names.clear();
        // System.out.println(names);

        names.forEach(System.out::println);
        System.out.println();

        System.out.println("Iterator Method\n");
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        System.out.println("=================================");

        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(3);
        numberList.add(4);
        numberList.add(4);
        numberList.add(3);
        numberList.add(5);
        numberList.add(1);
        System.out.println(numberList);

        // Set<Integer> numberSet = new HashSet<>();
        // numberSet.addAll(numberList);
        // // Number Set Automatically Remove Duplicates
        // System.out.println(numberSet);

        // Number Set Automatically Remove Duplicates
        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);

        System.out.println();

        //TreeSet

        System.out.println("TreeSet");
        Set<String> names1 = new TreeSet<>(names);
        // do the Natural Order , Alphabical 
        // HashSet is so much Faster than TreeSet
        System.out.println(names1);

        System.out.println();

        // LinkedHashSet

        System.out.println("LinkedHashSet");
        Set<String> names2 = new LinkedHashSet<>(names);
       // Print Out in the Way they were put in 
        System.out.println(names2);
    }    

}