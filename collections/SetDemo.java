package com.ajayganesh.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  private SetDemo() {}

  public static void show() {
    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

    // Union -> Combination of two sets (without duplicates)
    set1.addAll(set2);
    print(set1); // [a, b, c, d]

    print(set2); // [b, c, d]

    // Intersection - Which elements are common from both sets
    set1.retainAll(set2);
    print(set1); // [b, c, d]

    set1.add("x");
    set1.add("y");
    set1.add("z");
    print(set1); // [b, c, d, x, y, z]

    print(set2); // [b, c, d]


    // Difference
    set1.removeAll(set2); // Removing all elements which are in set2
    print(set1); // [x, y, z]
  }

  public static <T> void print(Collection<T> set) {
    System.out.println(set);
  }
}
