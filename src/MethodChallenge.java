public class MethodChallenge {
    public static void main(String[] args) {
    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Brook ", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Sam ", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ram ", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Rita ", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position"
        + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
    public static void checkNumber (int number){

    }
}
