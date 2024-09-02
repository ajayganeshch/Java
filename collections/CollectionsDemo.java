package com.ajayganesh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
  private CollectionsDemo() {}

  public static void show() {
    Collection<String> elements = new ArrayList<>();
    elements.add("a");
    elements.add("b");
    elements.add("c");
    // Collections.addAll(elements, "a", "b", "c");

    for (var element : elements) {
      System.out.println(element);
    }
    //
    // Output:
    // a
    // b
    // c


    // Or without using for-loop we can directly print elements by:
    // System.out.println(collection); // [a, b, c]

    printSize(elements); // Size is: 3

    System.out.println("The element (a) : " + elements.contains("a")); // The element (a) : true
    System.out.println("The element (z) : " + elements.contains("z")); // The element (z) : false

    elements.remove("b"); // remove item "b"

    printSize(elements); // Size is: 2

    elements.clear(); // Emp

    printSize(elements); // Size is: 0

    Collections.addAll(elements, "a", "b", "c");

    // toArray() -> has 3 method forms that are overloaded

    // if no arguments are passed, then it returns an Object[] (Object Array).
    // Every item in this array is instance of "Object Class"
    // Object[] objectArray = elements.toArray();


    // String[] stringArray = elements.toArray(new String[0]);

    Collection<String> other = new ArrayList<>();
    other.addAll(elements);

    System.out.println(elements == other); // false , as we know these are reference types, so it
                                           // will compare their addresses
    System.out.println(elements.equals(other)); // true
  }

  public static <T> void printSize(Collection<T> collection) {
    System.out.println("Size is: " + collection.size()); // Size is: 0
  }
}
