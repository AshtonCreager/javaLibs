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
        String noun1;
        String verb1;
        String adjective1;
        String noun2;
        String verb2;
        String adjective2;
        String otherName;
        
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
        
        System.out.println("Give a noun");
        noun1 = sc.nextLine();
        
        System.out.println("Give a verb with 'ing' at the end");
        verb1 = sc.nextLine();
        
        System.out.println("Give another name");
        otherName = sc.nextLine();
        
        System.out.println("Give an adjective");
        adjective1 = sc.nextLine();
        
        System.out.println("Give another noun");
        noun2 = sc.nextLine();
        
        System.out.println("Give another verb with 'ing' at the end");
        verb2 = sc.nextLine();
        
        System.out.println("Give another adjective");
        adjective2 = sc.nextLine();
        
        System.out.println(animal +" "+ firstName + " walks into a bar and sees " + otherName +"" 
                + " with their " + animal + " sitting next to him holding a " + noun1 + ""
                + "\n in its hands while " + verb1 +". " + firstName + " starts "+ verb2 + ""
                + " out of confusion and starts seeing " + adjective1 + "the the"
                + "\n "+ animal + " ran out of the bar and then turned" + adjective2 + "then"
                + " "+ otherName + "followed it out the door.\n " + firstName + "was confused "
                + "and passed out.");
    }   
        
}
