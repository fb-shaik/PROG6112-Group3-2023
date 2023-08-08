/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movienightpopularity;

/**
 *
 * @author fshai
 */

import javax.swing.JOptionPane;

public class MovieNightPopularity {

    public static void main(String[] args) {
        int numMovies = 5; // You can change this value to adjust the number of movies

        // Display welcome message using JOptionPane
        JOptionPane.showMessageDialog(null,
                "Welcome to Movie Night Popularity!\n\n"
                + "Please enter the names and ratings of " + numMovies + " movies.\n\n"
                + "Ratings should be between 1.0 and 5.0.");

        // Arrays to store movie names and their respective ratings
        String[] movieNames = new String[numMovies];
        double[] movieRatings = new double[numMovies];

        // Get user input for movie names and ratings using methods
        getUserInput(numMovies, movieNames, movieRatings);

        // Calculate the average rating for each movie
        double averageRating = calculateAverageRating(movieRatings);

        // Find the index of the most popular movie (the one with the highest average rating)
        int mostPopularIndex = findMostPopularMovieIndex(movieRatings);

        // Display the result using JOptionPane
        displayResult(numMovies, movieNames, movieRatings, averageRating, mostPopularIndex);
    }

    // Method to get user input for movie names and ratings
    private static void getUserInput(int numMovies, String[] movieNames, double[] movieRatings) {
        for (int i = 0; i < numMovies; i++) {
            boolean validInput = false;
            while (!validInput) {
                String nameInput = JOptionPane.showInputDialog(null,
                        "Enter the name of movie " + (i + 1) + ":",
                        "Movie Night Popularity", JOptionPane.QUESTION_MESSAGE);

                // Check if the user clicked cancel, and if so, exit the program
                if (nameInput == null) {
                    System.exit(0);
                }

                // Store the movie name after trimming any leading or trailing whitespace
                movieNames[i] = nameInput.trim();

                String ratingInput = JOptionPane.showInputDialog(null,
                        "Enter the rating for " + movieNames[i] + ":",
                        "Movie Night Popularity", JOptionPane.QUESTION_MESSAGE);

                // Check if the user clicked cancel, and if so, exit the program
                if (ratingInput == null) {
                    System.exit(0);
                }

                // Parse the rating input into a double value
                movieRatings[i] = Double.parseDouble(ratingInput);

                // Check if the entered rating is within the valid range (1.0 to 5.0)
                if (movieRatings[i] < 1.0 || movieRatings[i] > 5.0) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid rating! Please enter a valid number between 1.0 and 5.0.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // If all inputs are valid, mark the input as valid and proceed to the next movie
                    validInput = true;
                }
            }
        }
    }

    // Method to calculate the average rating for the movies
    private static double calculateAverageRating(double[] movieRatings) {
        double totalRatings = 0.0;
        for (double rating : movieRatings) {
            totalRatings += rating;
        }
        return totalRatings / movieRatings.length;
    }

    // Method to find the index of the most popular movie (the one with the highest average rating)
    private static int findMostPopularMovieIndex(double[] movieRatings) {
        int mostPopularIndex = 0;
        double highestRating = movieRatings[0];
        for (int i = 1; i < movieRatings.length; i++) {
            if (movieRatings[i] > highestRating) {
                highestRating = movieRatings[i];
                mostPopularIndex = i;
            }
        }
        return mostPopularIndex;
    }

    // Method to display the result using JOptionPane
    private static void displayResult(int numMovies, String[] movieNames, double[] movieRatings,
                                      double averageRating, int mostPopularIndex) {
        StringBuilder resultMessage = new StringBuilder("Movie Night Popularity\n");
        resultMessage.append("----------------------\n");

        // Append the name and average rating of each movie to the result message
        for (int i = 0; i < numMovies; i++) {
            resultMessage.append("Movie: ").append(movieNames[i]).append("\t");
            resultMessage.append(" Rating: ").append(movieRatings[i]).append("\n");
        }

        // Append the name of the most popular movie to the result message
        resultMessage.append("\n\nThe most popular movie for the movie night is: ")
                .append(movieNames[mostPopularIndex]);

        // Append the overall average rating to the result message
        resultMessage.append("\n\nOverall Average Rating: ").append(averageRating);

        // Show the result using JOptionPane in an information message dialog
        JOptionPane.showMessageDialog(null, resultMessage.toString(),
                "Movie Night Popularity", JOptionPane.INFORMATION_MESSAGE);
    }
}



