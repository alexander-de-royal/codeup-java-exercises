//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i++);
//        }
//    }
//
//    public static void doWhile(String[] args) {
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//    }
//
//    public static void backwardsDoWhile(String[] args) {
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);
//    }
//
//    public static void squaredDoWhile(String[] args) {
//        int l = 2;
//        do {
//            System.out.println(l);
//            l *= l;
//        } while (l <= 1000000);
//    }
//
//    public static void forLoop(String[] args) {
//        for (int m = 100; m >= -10; m -= 5) {
//            System.out.println(m);
//        }
//    }
//
//    public static void forLoopTwo(String[] args) {
//        for (int n = 2; n <= 1000000; n *= n) {
//            System.out.println(n);
//        }
//    }
//
//    public static void fizzBuzz(String[] args) {
//        for (int p = 0; p <= 100; p++) {
//            if (p % 3 == 0 && p % 5 == 0) {
//                System.out.print("FizzBuzz");
//            } else if (p != 0 && p % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (p != 0 && p % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(p);
//            }
//        }
//    }
//
//    public static void tableOfPowers(String[] args) {
//        System.out.println("Please enter an integer");
//        int num = scanner.nextInt();
//        System.out.println();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------ | ------");
//
//        for (int q = 1; q <= num; q++) {
//            int squared = q * q;
//            int cubed = q * q * q;
//            System.out.printf("%-6d | %-7d | %d%n", q, cubed);
//        }
//    }
//
//    public static void tableOfPowerDavid(String[] args) {
//        boolean WantsToContinue;
//        Scanner scan = new Scanner(System.in);
//
//        do {
//            System.out.print("Pleases enter a number");
//            int Num = scanner.nextInt();
//            System.out.println("Here is your table! \n number | squared | cubed \n ------ | ------ | ------");
//            for (int r = 1; r <= Num; r++) {
//                System.out.printf("%-6d | %-7d | %d%n", r, r * r, r * r * r);
//            }
//            System.out.println("Please enter another number");
//            String UserAns = scan.nextLine();
//            WantsToContinue = UserAns.equals("y");
//        } while (WantsToContinue);
//    }
//
//    public static void numberToLetter(String[] args) {
//        String option;
//        do {
//            System.out.println("Enter a number between 0 and 100:");
//            int Input = scanner.nextInt();
//            String Grade;
//            if (Input >= 97 && Input <= 96) {
//                Grade = "A+";
//            } else if (Input >= 93 && Input <= 96) {
//                Grade = "A";
//            } else if (Input >= 90 && Input <= 92) {
//                Grade = "A-";
//            } else if (Input >= 87 && Input <= 89) {
//                Grade = "B+";
//            } else if (Input >= 83 && Input <= 86) {
//                Grade = "B";
//            } else if (Input >= 80 && Input <= 82) {
//                Grade = "B-";
//            } else if (Input >= 77 && Input <= 79) {
//                Grade = "C+";
//            } else if (Input >= 73 && Input <= 76) {
//                Grade = "C";
//            } else if (Input >= 70 && Input <= 72) {
//                Grade = "C-";
//            } else if (Input >= 67 && Input <= 69) {
//                Grade = "D+";
//            } else if (Input >= 65 && Input <= 66) {
//                Grade = "D";
//            } else {
//                Grade = "F";
//            }
//            System.out.println("Your grade is: " + Grade);
//            System.out.println("Continue? (y/n): ");
//            option = scanner.next();
//        } while (option.equals(("y")));
//    }
//}
