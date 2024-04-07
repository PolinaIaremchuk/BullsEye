//Class Score helps to calculate and determine the winner.
//Methods: score(double x, double y); deterWinner(int playerOneScore, int playerTwoScore)
public class Score {

//method to calculate the score
    //@Param double x, double y
    //@Return int
    public int score(double x, double y) {
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 3.0) //Bulls Eye
            return 100;
        else if (distance <= 6.0) //Outer Bull Eye
            return 80;
        else if (distance <= 9.0) //Triple ring
            return 60;
        else if (distance <= 12.0) //Double ring
            return 40;
        else if (distance <= 15.0) //Single ring
            return 20;
        else
            return 0;
    }

    //Method to determine the winner based on the score
    //@Param int playerOneScore, int playerTwoScore

    public void deterWinner(int playerOneScore, int playerTwoScore) {
        if (playerOneScore > playerTwoScore) {
            System.out.println("SCORE: " + playerOneScore + " to " + playerTwoScore + ", PLAYER 1 WINS.");
        } else if (playerTwoScore > playerOneScore) {
            System.out.println("SCORE: " + playerOneScore + " to " + playerTwoScore + ", PLAYER 2 WINS.");
        } else {
            System.out.println("SCORE: " + playerOneScore + " to " + playerTwoScore + ", TIE.");
        }
    }
}

