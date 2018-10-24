/*
 * Author: Ahmed Al-Hayali
 * Last edit date: 23/10/2018
 * Program: Calculate powers according to user inputted number(s)
 */
package u2_a2_loopsandpowers;

//Import keypress scanner to detect keystrokes within console
import java.util.Scanner;

public class U2_A2_LoopsAndPowers {
    
    public static void main(String[] args) {
        
        //Keypress scanner within console window initialization
        Scanner keyPress = new Scanner(System.in);
        
        //Variable declaration and initialization area
        int actionNmbr = 0, userNmbr = 1, xpntNmbr = 1, userXpnt = 1, pwrNmbr = 1;
        
        //Header displaying the title of the program
        System.out.println("The Powers Program!");
        
        //A while loop to infinitely run the program until action 4 is executed, therefore exiting the program
        while (actionNmbr != 4) {
            //Displays the options a user can select
            System.out.println("\n---------------------------------------------");
            System.out.println("Option 1: Find the value of a number, squared.");
            System.out.println("Option 2: Find the value of a number, cubed.");
            System.out.println("Option 3: Find the value of a number, to any exponent.");
            System.out.println("Option 4: Exit.");
            System.out.println("\nPlease enter the INTEGER NUMBER of the option you'd like to proceed to:");
            //Gathers the user's option selection as a variable number 
            actionNmbr = (int) Integer.parseInt(keyPress.nextLine());
            
            //A series of switch statements that operate the intended command after the user has selected their option
            switch (actionNmbr) {
                //Prompts user for a number, a base, then calculates the square result
                case 1:
                    System.out.println("\nPlease enter the number you'd like to square:");
                    userNmbr = (int) Integer.parseInt(keyPress.nextLine());
                    //Runs a loop to produce the desired number from user's input values.
                    for(xpntNmbr = 1; xpntNmbr <= 2; xpntNmbr ++) {
                        pwrNmbr *= userNmbr;
                    }
                    System.out.println("The number " + userNmbr + " squared is: " + pwrNmbr); 

                    //System.out.println("The number " + userNmbr + " squared is: " + (Math.pow(userNmbr, 2)));
                    break;
                //Prompts user for a number, a base, then calculates the cube result
                case 2:
                    System.out.println("\nPlease enter the number you'd like to cube:");
                    userNmbr = (int) Integer.parseInt(keyPress.nextLine());
                    System.out.println("The number " + userNmbr + " cubed is: " + (Math.pow(userNmbr, 3)));
                    break;
                //Prompts user for a 2 numbers, a base and an exponent, then calculates the power result
                case 3:
                    System.out.println("\nPlease enter the number you'd like to raise to a power:");
                    userNmbr = (int) Integer.parseInt(keyPress.nextLine());
                    System.out.println("\nPlease input the exponent you'd like to raise your number to:");
                    userXpnt = (int) Integer.parseInt(keyPress.nextLine());
                    //Runs a loop to produce the desired number from user's input values.
                    for(xpntNmbr = 1; xpntNmbr <= userXpnt; xpntNmbr ++) {
                        pwrNmbr *= userNmbr;
                    }
                    System.out.println("The number " + userNmbr + " to the power of " + userXpnt + " is: " + pwrNmbr); 
                    
                    //System.out.println("The number " + userNmbr + " to the power of " + pwrNmbr + " is: " + (Math.pow(userNmbr, pwrNmbr)));
                    break;
                //Buffer statement to prevent the program from displaying "enter a valid input" when option 4 is selected at the beginning
                case 4:
                    System.out.println("");
                    break;
                //Displays the default output, prompting the user to enter a valid input
                default:
                    System.out.println("\nPlease enter a valid input.");
                    break;
            }
            
        }
        //Displays the final output before ending the build, the program exit text
        System.out.println("You have exited the program.");
    }
}