package com.ajayganesh;

public class TaxReport {

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
}
