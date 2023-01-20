/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 * hello there
 * @author arsal
 */
import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Asking the user for input
        System.out.println("Please enter a word: ");
        String word = input.nextLine();
        
        //Getting the length for the array
        char[] myLetters = new char[word.length()];
        
        //Storing each character of the word in the array
        for (int i = 0; i < myLetters.length; i++) {
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
        
        //Printing the array in reverse
        System.out.println();
        System.out.println("printing in reverse");
        
        for (int i = myLetters.length-1; i >= 0; i--){
            System.out.print(myLetters[i]);
        }
    }
}
