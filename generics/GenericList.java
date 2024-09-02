package com.ajayganesh.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericList<T> implements Iterable<T> {
  @SuppressWarnings("unchecked")
  final T[] items = (T[]) new Object[10];

  int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }

  // This method returns an iterator object this iterator is an actually an interface declared in
  // java.util package

  @Override
  public Iterator<T> iterator() {
    return new ListIterator(this);
  }

  private class ListIterator implements Iterator<T> {

    private final GenericList<T> list;
    private int index;

    public ListIterator(GenericList<T> list) {
      this.list = list;
    }

    @Override
    public boolean hasNext() {
      return (index < list.count);
    }

    @Override
    public T next() throws NoSuchElementException {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      return list.items[index++];
    }

  }

}
