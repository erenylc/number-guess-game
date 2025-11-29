/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findingnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class FindingNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        
        System.out.println("Welcome to our number guessing game!!");
        int result=rand.nextInt(100);
        
        while(true){
        System.out.print("Guess the number:");
        int number=input.nextInt();
        
         if (number < 0) {
            System.out.println("You cannot enter a negative number. Please enter a number between 0 and 99");
            continue; // Skip this prediction
        }
         if (number > 99) {
            System.out.println("You cannot enter a number greater than 100. Please enter a number between 0 and 99");
            continue;
        }
      
        if(number<result){
            System.out.println("Your guess was too small, guess a higher number");         
        }else if(number>result){
            System.out.println("Your guess is too big, guess a smaller number");
        }else{
            System.out.println("You won the game bravo!!");
            System.out.println("Your guess equals the number ");
            break;
        }
      }
        
    }
}
