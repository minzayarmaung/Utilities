package CodingWithJohn.Maps;

import java.util.HashMap;

public class MapAndHashMap {
    public static void main(String[] args) {
        // Why HashMap ? HashMap is used to store key-value paris, where each value is unique
        // For Example , Pairing Staff Name and Staff ID

        HashMap<String,Integer> staffID = new HashMap<>();

        staffID.put("Aung Aung", 1234);
        staffID.put("Mg Mg", 4321);
        staffID.put("Zaw Zaw", 3214);

        System.out.println(staffID);

        System.out.println(staffID.get("Aung Aung"));

        System.out.println(staffID.containsKey("Aung Aung"));

        System.out.println(staffID.containsValue(1234));

        staffID.put("Aung Aung", 1122);
        System.out.println(staffID);

        staffID.replace("Mg Zaw",100200);

        staffID.putIfAbsent("MG Zaw", 112233);
        System.out.println(staffID);


    }
}
