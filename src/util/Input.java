package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Yes or No?");

        String userInput = this.scanner.nextLine();

        userInput = userInput.toLowerCase();

        switch (userInput) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("yes"):
                return true;
            case ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                System.out.println("Input is unacceptable");
        }
        public int getInt(){
            System.out.println("Please enter an Int");
            return this.scanner.nextInt();
        }
    }
}
