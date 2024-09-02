package com.ajayganesh.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class QueueDemo {
  private QueueDemo() {}

  public static void show() {
    Queue<String> queue = new ArrayDeque<>(5);
    queue.add("c");
    queue.add("b");
    queue.add("a");

    print(queue); // [c, b, a]

    queue.offer("x");

    print(queue); // [c, b, a, x]

    queue.add("abc");

    print(queue); // [c, b, a, x, abc]

    queue.add("xyz");

    print(queue); // [c, b, a, x, abc, xyz]

    // Doesn't overrides the queue, just return element.
    var front = queue.peek(); // Just gives the front element of queue (first element of queue)
    System.out.println(front); // c

    print(queue); // [c, b, a, x, abc, xyz]

    queue.clear();

    print(queue); // []

    // This is same as peek but , If queue was empty then it throws exception
    // (java.util.NoSuchElementException)
    // var someEle = queue.element();

    var someEle = queue.peek(); // If queue was empty this returns null
    System.out.println(someEle); // null

    Collections.addAll(queue, "a", "b", "c");

    print(queue); // [a, b, c]

    // .remove() method removes the first element and return it, and it also mutate the queue
    var frontEle = queue.remove();
    System.out.println(frontEle); // a
    print(queue); // [b, c]

    // Same as remove, there was poll (which returns null if queue was empty), but
    // remove which throws exception when queue was empty (java.util.NoSuchElementException)
  }

  public static <T> void print(Collection<T> queue) {
    System.out.println(queue);
  }
}
