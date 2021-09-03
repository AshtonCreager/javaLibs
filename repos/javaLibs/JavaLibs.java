/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;
        
/**
 *
 * @author acreager
 */
public class JavaLibs {

    /**
     * boolean
     * int
     * double
     * string
     */
    public static void main(String[] args) {
        String firstName;
        String age;
        String animal;
        String candy;
        String pop;
        String feeling;
        
        int number1 = 0;
        int number2 = 0;
        int total = 0;
        
        double number3 = 0;
        double number4 = 0;
        double total2 = 0;
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("What is you first name?");
        firstName = sc.nextLine();
        
        System.out.println("How old are you?");
        age = sc.nextLine();
        
        System.out.println("Give the first whole number.");
        number1 = sc.nextInt();
        
        System.out.println("Give the second whole number");
        number2 = sc.nextInt(); 
        
        total = number1 + number2;
        System.out.println(firstName + " the answer for this is: " + total);
        
        System.out.println("Give a decimal number");
        number3 = sc.nextDouble();
        
        System.out.println("Give another decimal number");
        number4 = sc.nextDouble();
       
        total2 = number3 + number4;
        System.out.println(firstName + " the answer for this is: " + total2);
        sc.nextLine();
        
        System.out.println("Name one animal");
        animal = sc.nextLine();
        
        System.out.println(firstName + " you have " + total +" "+ animal + " and they"
                + " have been in your house for " + total2 + " hours!");
        
        System.out.println("what is your favorite candy?");
        candy = sc.nextLine();
        
        System.out.println("what is you favorite pop?");
        pop = sc.nextLine();
        
        System.out.println("well "+ firstName + " the " + animal + " probably ate all "
                + "of your " + candy + " and probably spilled all of your " + pop);
        
        System.out.println("How does this make you feel");
        feeling = sc.nextLine();
        
    }
    
}
