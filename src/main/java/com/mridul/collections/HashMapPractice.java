package com.mridul.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        // Crate HashMap
        Map<String, String> employees = new HashMap<>();

        // Add entries
        employees.put("E101", "Rahul");
        employees.put("E102", "Priya");
        employees.put("E103", "Amit");
        employees.put("E104", "Neha");

        //1. Print complete Map
        System.out.println("Complete Map: "+ employees);

        //2. Get the employee with ID E102
        System.out.println("Employee with ID E102: "+employees.get("E102"));

        //3. Check whether "E103" exists
        System.out.println("Contains key E103: "+employees.containsKey("E103"));

        //4. check whether "Rahul" exists
        System.out.println("Contains value Rahul: "+ employees.containsValue("Rahul"));

        //5. Update "E103" from Amit to Arjun
        employees.put("E103","Arjun");

        //6. Remove "E104"
        employees.remove("E104");

        //7. Print all keys
        System.out.println("All keys:  "+ employees.keySet());

        //8. Print all values
        System.out.println("All avalues: "+ employees.values());

        //9. Iterate using entrySet()
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
