/**
*
* @Author Emre Bas
* Version: 1.0
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

    System.out.println("Welcome to salary calculator!");
    System.out.print("Please enter name: ");
    String name = sc.next();
    System.out.print("Please enter salary from "+ name+": ");
    float salary = sc.nextFloat();
    System.out.print("Please enter work hours from "+ name+": ");
    float workHours = sc.nextFloat();
    System.out.print("Please enter hire year from "+ name+": ");
    int hireYear= sc.nextInt();

    Employee emp = new Employee(name,salary,workHours,hireYear);
    System.out.println(emp.toString());
    





    
  }
}