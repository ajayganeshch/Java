package com.ajayganesh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
  private ListDemo() {}

  public static void show() {
    List<String> list = new ArrayList<>();

    // list.add("a");
    // list.add("b");
    // list.add("c");

    Collections.addAll(list, "a", "b", "c");

    System.out.println(list.get(0)); // a

    printList(list); // [a, b, c]

    list.add(1, "!");

    printList(list); // [a, !, b, c]

    list.set(0, "a+");

    printList(list); // [a+, !, b, c]

    list.remove(0);

    printList(list); // [!, b, c]

    System.out.println(list.indexOf("a")); // -1 , as "a" is not there
    System.out.println(list.indexOf("b")); // 1

    list.add("b");

    printList(list); // [!, b, c, b]

    System.out.println(list.indexOf("b")); // 1
    System.out.println(list.lastIndexOf("b")); // 3

    System.out.println(list.subList(1, 3)); // [b, c]
  }

  public static <T> void printList(Collection<T> list) {
    System.out.println(list);
  }
}
