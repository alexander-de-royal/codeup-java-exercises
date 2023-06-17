public class OverloadedChallenge {
    public static void main(String[] args ){
        System.out.println("68inch" + convertToCentimeters(68) + "cm");
        System.out.println("5ft, 8inch" + convertToCentimeters(5,8) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int inches, int feet) {
        return ((feet * 12) + inches) * 2.54;
    }

}
