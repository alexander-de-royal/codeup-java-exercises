import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[4];

        prices[0] = 9.99;
        prices[1] = 10.99;
        prices[3] = 899.99;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);

        String[] beatles = {"Paul", "John", "Ringo", "George"};
        System.out.println(Arrays.toString(beatles));

        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}
