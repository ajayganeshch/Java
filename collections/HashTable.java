package com.ajayganesh.collections;

import java.util.HashMap;
import java.util.Map;


public class HashTable {
  public static void show() {
    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e2");
    var c3 = new Customer("c", "e3");

    Map<String, Customer> map = new HashMap<>(); // Key -> String , Value -> Customer

    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);
    map.put(c3.getEmail(), c3);

    System.out.println(map); // {e1=a, e2=b, e3=c}

    var customer = map.get("e1");
    System.out.println(customer); // a

    var some = map.get("e10");
    System.out.println(some); // null

    var unknown = new Customer("myNameIsBahubali", "ajay");

    // As here e10 doesn't exist so it returns default value of unknown
    var someEl = map.getOrDefault("e10", unknown);
    System.out.println(someEl); // myNameIsBahubali

    var exists = map.containsKey("e1");
    System.out.println(exists); // true

    System.out.println(map); // {e1=a, e2=b, e3=c}

    // As we see here I mentioned the email as z+ , but it doesn't change, only
    // the name is changed i.e value
    map.replace("e1", new Customer("a++", "z+"));
    System.out.println(map); // {e1=a++, e2=b, e3=c}

    // map.replace("e2", "e5"); wrong

    for (var key : map.keySet()) {
      System.out.println(key);
    }
    // e1
    // e2
    // e3

    for (var entry : map.entrySet()) {
      System.out.println(entry);
    }
    // e1=a++
    // e2=b
    // e3=c

    for (var entry : map.entrySet()) {
      System.out.println(entry.getValue());
      System.out.println(entry.getKey());
    }
    // a++
    // e1
    // b
    // e2
    // c
    // e3

    // Order is not guaranteed
    for (var currentCustomer : map.values()) {
      System.out.println(currentCustomer);
    }
    // a++
    // b
    // c
  }
}
