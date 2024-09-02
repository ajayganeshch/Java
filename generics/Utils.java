package com.ajayganesh.generics;

public class Utils {
  private Utils() {}

  public static <T extends Comparable<T>> T max(T first, T second) {
    return (first.compareTo(second) < 0) ? second : first;
  }

  public static <K, V> void print(K key, V value) {
    System.out.println(key + " = " + value);
  }

  public static void printUser(User user) {
    System.out.println(user);
  }

  // class CAP#1 extends User {}
  public static void list(GenericList<? extends User> users, int index) {
    var user = users.get(index);
    System.out.println(user);
  }

  public static void list(GenericList<? super Instructor> users, Instructor instructor) {
    users.add(instructor);
    System.out.println("Added!");
  }

  // return type (V)
  public static <K, V> V returnGeneric(K key, V value) {
    System.out.println("Hey returning value of " + key + " !!!");
    return value;
  }
}
