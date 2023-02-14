/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classworkparking;

import java.util.Scanner;

/**
 *
 * @author ramlifting
 */
public class ClassworkParking {
 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the number of hours parked (type 0 to exit): ");
      double hoursParked = input.nextDouble();

      if (hoursParked == 0) {
        break;
      }

      double customerCharge = calculateCharges(hoursParked);

      System.out.println("Charge for this customer: $" + customerCharge);
    }
  }

  public static double calculateCharges(double hoursParked) {
    double fee = 2.0;
    if (hoursParked > 3) {
      fee += (hoursParked - 3) * 0.5;
    }
    fee = Math.min(fee, 10.0);
    return fee;
  }
}

 
  
  
  

