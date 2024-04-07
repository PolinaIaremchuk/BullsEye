/* Name: Polina Iaremchuk
# Date: 04/01/2024
# Class: CSC1120, 11 am
# Pledge: I have neither given nor received unauthorized aid on this program.
# Description: A simple dartboard consists of a flat, circular piece of cork with concentric rings drawn on it.
Darts are thrown at the board by players in an attempt to hit the center of the dartboard (the Bullseye). The
region between each pair of rings (or the center and the first ring) represents a certain point value.
Ring radii are at 3”, 6”, 9”, 12” and 15” (the Bullseye has a diameter of 6”). A game of Simple Darts between
two players is played as follows. The first player throws 3 darts at the board. A score is computed by adding up
the point values of each region that a dart lands in. The darts are removed. The second player throws 3 darts at
the board; the score for player two is computed the same way as it is for player one. The player with the higher
score wins.
#Methods:  read(), getCoordinates()
# Input: The input is given from the text file "Coordinate".
The program iterates through each pair of coordinates and counts the score of both players. The player whose score is bigger wins, if the score is equal they get a tie.
# Output:The program will display the winner after several rounds of play. Or tie if the score is equal.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReading {
    private List<double[][]> games; // List to store coordinates for each game

    public FileReading() { //constructor for games of the arraylist
        games = new ArrayList<>();
    }

    //method to read the file with coordinates that throws exception.
    public void read() throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("Coordinate"));

        // Read each line (game) separately
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] coordinatesStr = line.split(" ");

            // Convert coordinate strings to doubles
            double[][] gameCoordinates = new double[coordinatesStr.length / 2][2];
            int index = 0;
            for (int i = 0; i < gameCoordinates.length; i++) {
                for (int j = 0; j < 2; j++) {
                    gameCoordinates[i][j] = Double.parseDouble(coordinatesStr[index++]);
                }
            }

            // Add game coordinates to the list
            games.add(gameCoordinates);
        }

        fileScan.close();
    }
//an accessor for games,
    //@Returns List<double[][]> games
    public List<double[][]> getCoordinates() {
        return games;
    }
}





