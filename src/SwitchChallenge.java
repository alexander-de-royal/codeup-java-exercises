public class SwitchChallenge {
//    public static void main(String[] args) {
//        char charValue = 'A';
//        switch (charValue){
//            case 'A':
//                System.out.println("A is able");
//                break;
//            case 'B':
//                System.out.println("B is baker");
//                break;
//            case 'C':
//                System.out.println("C is charlie");
//                break;
//            case 'D':
//                System.out.println("D is dog");
//                break;
//            default:
//                System.out.println("Letter " + charValue);
//                break;
//        }
        public static void main(String[] args) {

        }

        public static void printDayOfWeek(int day) {
            String dayOfWeek = switch (day){
                case 0 -> {yield "Sunday";}
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid Day";
            };
        System.out.println(day + " stands for " + dayOfWeek);
        }
}


