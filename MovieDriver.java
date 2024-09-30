/*
 * Class: CMSC-203-22355  
 * Instructor: David Kuijt
 * Description: This class allows the user to interact with the program by entering a movie title, rating and tickets sold 
 * Due: 09/29/24
 * Platform/compiler: Windows / Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Tuan Pho
*/

package lab1.Task_2;

import java.util.Scanner; 

public class MovieDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String addMovie = "y"; 

        do {
            Movie movie = new Movie();

            System.out.print("Enter the name of a movie\n"); 
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie\n");
            String rating = keyboard.nextLine();
            movie.setRating(rating);
            
            System.out.print("Enter the number of tickets sold for this movie\n");
            int soldTickets = keyboard.nextInt();

            keyboard.nextLine(); 
            movie.setSoldTickets(soldTickets);

            System.out.println(movie); 

            System.out.print("Do you want to enter another? (y or n)\n");
            addMovie = keyboard.nextLine();

        } while (addMovie.equalsIgnoreCase("y")); 

        System.out.println("Goodbye");

        keyboard.close();
    }
}
