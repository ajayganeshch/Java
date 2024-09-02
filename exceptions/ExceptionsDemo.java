package com.ajayganesh.exceptions;

public class ExceptionsDemo {

  public static void show() throws Throwable {
    try {
      var account = new Account();
      account.withdraw(10);
    } catch (AccountException e) {
      e.printStackTrace();
    }
  }
}
