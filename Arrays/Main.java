import java.util.*;

public class Main {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - minprice > maxprofit) {

                maxprofit = prices[i] - minprice;
            }
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter the prices: ");
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = s.nextInt();
        }
        int result = maxProfit(prices);
        System.out.println(result);


    }
   
}