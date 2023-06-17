import java.util.Random;
import java.util.Scanner;

public class ControlStatementsAndLoopsLecture {
    public static void main(String[] args) {
        System.out.println(18 > 5);
        System.out.println(18 < 55);
        System.out.println(18 >= 18);
        System.out.println(18 <= 28);

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the letter y");
        String input = sc.next();
//        boolean wasItY = input == "y";
        boolean wasItY = input.equals("y");
        System.out.println(wasItY);

        if(wasItY){
            System.out.print("That was infact Y");
        } else {
            System.out.print("that was not in fact Y That was " + input + ".");
        }

        System.out.println("What is your favo number?");
        int favoriteNumber = sc.nextInt();

        switch (favoriteNumber){
            case 1:
                System.out.println("Player one, you're number one");
                break;
            case 2:
                System.out.println("Player two, you're the dude");
                break;
            default:
                System.out.println("Something goes here");

        }

//        int count = 99;
//        while(count > 0){
//            System.out.println("%here it goes", count, count, --count);
//        }
//        boolean signedUpForReadersDigest = true;

        int randomNum = (int) Math.floor(Math.random() * 10);
        System.out.println(randomNum);
        for(int i = 0; i < 10; i++){
            if(i == randomNum){
                System.out.println("let's skip that number");
                continue;

            }
        }


    }
}
