import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is not approximately %.2f", pi);

        System.out.println("Please enter an Integer");

        int userInput = scanner.nextInt();
        System.out.println("User entered: " + userInput);

        System.out.println("Please enter three words");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println("wordOne = " + wordOne);
        System.out.println("wordTwo = " + wordTwo);
        System.out.println("wordThree = " + wordThree);

//        String sentence = scanner.next();

        String sentence = scanner.nextLine();
        System.out.println("Please enter a sentence");
        System.out.println("sentence = " + sentence);

        System.out.println("Please enter an integer width");
        String userInput1 = scanner.nextLine();
        int width = Integer.parseInt(userInput1);
        System.out.println("Please enter an integer height");
        String userInput2 = scanner.nextLine();

        int height = Integer.parseInt(userInput2);
        int area = width * height;
        int perimeter = 2 * (width + height);
        System.out.print(area);
        System.out.print(perimeter);
    }
}
