//Class that runs the program.
//# Input: The input is given from the text file "Coordinate".
// The program iterates through each pair of coordinates and counts the score of both players. The player whose score is bigger wins, if the score is equal they get a tie.
// # Output:The program will display the winner after several rounds of play. Or tie if the score is equal.
import java.io.FileNotFoundException;
import java.util.List;

public class Run_Bullseye {

    public static void main(String[] args) {
        Score theScore = new Score();
        FileReading f = new FileReading();

        try {
            f.read(); // Read coordinates from the file
            List<double[][]> games = f.getCoordinates(); // Get the coordinates from FileReading

            for (double[][] coordinates : games) {
                int playerOneScore = 0;
                int playerTwoScore = 0;

                // Calculate scores for player 1 (first three pairs of coordinates)
                for (int i = 0; i < 3; i++) {
                    playerOneScore += theScore.score(coordinates[i][0], coordinates[i][1]);
                }

                // Calculate scores for player 2 (last three pairs of coordinates)
                for (int i = 3; i < 6; i++) {
                    playerTwoScore += theScore.score(coordinates[i][0], coordinates[i][1]);
                }

                // Determine the winner
                theScore.deterWinner(playerOneScore, playerTwoScore);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading coordinates: " + e.getMessage());
        }
    }
}
