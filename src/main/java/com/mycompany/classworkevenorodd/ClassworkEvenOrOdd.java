/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classworkevenorodd;
import java.util.Scanner;
/**
 *
 * @author ramlifting
 */
    
public class ClassworkEvenOrOdd {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    
    System.out.print("Enter an integer (or -1 to quit): ");
    num = input.nextInt();
    
    while (num != -1) {
      if (num % 2 == 0) {
        System.out.println(num + " is even.");
      } else {
        System.out.println(num + " is odd.");
      }
      
      System.out.print("Enter an integer (or -1 to quit): ");
      num = input.nextInt();
    }
  }
}
 
