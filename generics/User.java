package com.ajayganesh.generics;

public class User implements Comparable<User> {

  private int points;

  public User(int points) {
    this.points = points;
  }

  @Override
  public int compareTo(User otherUser) {
    return points - otherUser.points;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    User otherUser = (User) obj;
    return points == otherUser.points;
  }

  @Override
  public int hashCode() {
    return points;
  }

  @Override
  public String toString() {
    return "Points = " + points;
  }
}
