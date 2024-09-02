package com.ajayganesh;

public class Employee {
  private int baseSalary;
  private int hourlyrate;
  public static int numberOfEmployees;

  public Employee(int baseSalary, int hourlyrate){
    setBaseSalary(baseSalary);
    setHourlyrate(hourlyrate);
    numberOfEmployees++;
  }

  public Employee(int baseSalary){
    // setBaseSalary(baseSalary);
    // setHourlyrate(0);
    this(baseSalary,0);
  }

  public static void printNoOfEmployees(){
    System.out.println("No of Employees: "+numberOfEmployees);
  }
  
  public int calculateWage(int extrahours){
    return baseSalary + (hourlyrate * extrahours);
  }

  public int calculateWage(){
    return baseSalary;
  }

  // Setter
  private void setBaseSalary(int baseSalary){
    if (baseSalary <= 0) throw new IllegalArgumentException("Salary should be greater than 0.");
    this.baseSalary = baseSalary;
  }
  
  private void setHourlyrate(int hourlyrate) {
   if(hourlyrate <0 ) throw new IllegalArgumentException("Hourlyrate should be greater than 0.");
   this.hourlyrate = hourlyrate;
 }

  // Getter
  // private int getBaseSalary(){
  //   return baseSalary;
  // }
  
  // private int getHourlyrate() {
  //   return hourlyrate;
  // }

}
