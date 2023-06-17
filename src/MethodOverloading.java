public class MethodOverloading {
    public static void main(String[] args) {
//        calculateScore("Tim", 500);
        int newScore = calculateScore("Tim", 500);
        System.out.print("New score is " + newScore);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score + 100;
    }


}
