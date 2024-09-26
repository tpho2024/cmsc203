/*
 * Class: CMSC-203-22355  
 * Instructor: David Kuijt
 * Description: This class tests the user's (extrasensory perception) by having them guess colors randomly selected from a file.
 * Due: 09/25/24
 * Platform/compiler: Windows / Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Tuan Pho
*/
package ESPGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) throws FileNotFoundException {

        final int TOTAL_COLORS = 16; 
        final int MAX_ROUNDS = 3; 

        Scanner userInput = new Scanner(System.in);
        Random randomNumberGenerator = new Random();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.print("Enter the filename: ");
        String colorsFilename = userInput.nextLine();

        File colorsFile = new File(colorsFilename);
        Scanner colorsFileReader = new Scanner(colorsFile);

        // Displays the colors from a file
        System.out.println("There are sixteen colors from a file:");
        for (int i = 1; i <= TOTAL_COLORS; i++) {
            if (colorsFileReader.hasNextLine()) { 
                System.out.println(i + " " + colorsFileReader.nextLine());
            }
        }
        int successfulGuesses = 0;
        
        for (int currentRound = 1; currentRound <= MAX_ROUNDS; currentRound++) {
            System.out.println("\nRound " + currentRound);

            int randomColorIndex = randomNumberGenerator.nextInt(TOTAL_COLORS) + 1;
            String chosenColor = "";

            // Reopens the file to read from the beginning
            colorsFileReader.close();
            colorsFileReader = new Scanner(colorsFile);

            for (int i = 1; i <= randomColorIndex; i++) {
                if (colorsFileReader.hasNextLine()) { 
                    chosenColor = colorsFileReader.nextLine();
                }
            }
            System.out.println("\nI am thinking of a color.");
            System.out.print("Is it one of the list of colors above?\nEnter your guess: ");
            String playerGuess = userInput.nextLine();

            if (playerGuess.equalsIgnoreCase(chosenColor)) {
                successfulGuesses++;
            }
            System.out.println("\nI was thinking of " + chosenColor + ".");
        }
        colorsFileReader.close();

        System.out.println("Game Over\n");
        System.out.println("You guessed " + successfulGuesses + " out of " + MAX_ROUNDS + " colors correctly.");

        // Gets the user's info
        System.out.print("Enter your name: ");
        String playerName = userInput.nextLine();

        System.out.print("Describe yourself: ");
        String playerDescription = userInput.nextLine();

        System.out.print("Due Date (MM/DD/YY): ");
        String assignmentDueDate = userInput.nextLine();

        System.out.println("\nUser Name: " + playerName);
        System.out.println("User Description: " + playerDescription);
        System.out.println("Date: " + assignmentDueDate);

        userInput.close(); 
    }
}
