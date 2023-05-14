//importing required classes for the program
import java.util.Scanner;
import java.lang.Math;

//here starts the main class
public class GuessingNum {
    public static void main(String args[]){
        //first generate a random number between 1-100
        int ans = (int)(Math.random() * 100)+1;
        //total number of trails that a user has to guess the number
        int k = 6;
        //create scanner object to read user input
        Scanner sc = new Scanner(System.in);
        //check if the user has guessed the right number
        boolean correct =false ;
        System.out.println("Thinking of a number! you have to guess that number/n");
        while(k>0){
            System.out.println("Enter the number you guessed\n");
            int guess = sc.nextInt();
            //if the user has guessed correctly the print congo
            if(guess==ans){
                System.out.println("congratulations you guessed !!!!\n");
                break;
            }
                //if the user has choosed greater number 
               else if (guess > ans) {
                            System.out.println("the guess is too high \n you have "+ (k-1) + " trials left ");
                            k--;
                
               } 
               //is the guessede number is low
               else {
                System.out.println("the guesseed number is too low \n you have "+ (k-1)+ " trials left ");
                k--;
               }
            }
             //if all trails are used print a message
            if(correct==false){
                System.out.println("you ran out of trails \n you lose\n");
            }
    
        }

    }
