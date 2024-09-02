package com.ajayganesh;

public interface TaxCalculator {
  double calculateTax();

  static double getTaxableIncome(double income, double expenses) {
    return income - expenses;
  }
}
