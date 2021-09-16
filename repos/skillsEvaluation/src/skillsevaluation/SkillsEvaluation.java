/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillsevaluation;

import java.util.Scanner;

/**
 *
 * @author acreager
 */
public class SkillsEvaluation {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number1 = 0;
       int number2 = 0;
       int total1 = 0;
       int total2 = 0;
       int total3 = 0;
       int total4 = 0;
       
        System.out.println("This program will calculate the sum, difference, product"
                + " and the quotient of two integers.");
        
        System.out.println("please enter the first integer:");
       
        number1 = sc.nextInt();
       
        System.out.println("please enter the second integer:");
        
        number2 = sc.nextInt();
        
        //addition
        total1 = number1 + number2;
        
        System.out.println(number1+ " and " +number2+ " added togther they make " +total1);
        
        //subtraction
        total2 = number1 - number2;
        
        System.out.println(number1+ " and " +number2+ " subtrated they equal " +total2);
        
        //mulitplication
        total3 = number1 * number2;
        
        System.out.println(number1+ " and " +number2+ " multiplied they make " +total3);
        
        //division
        total4 = number1 / number2;
        
        System.out.println(number1+ " and " +number2+ " divided they equal " +total4);
        
        
    }
    
}
