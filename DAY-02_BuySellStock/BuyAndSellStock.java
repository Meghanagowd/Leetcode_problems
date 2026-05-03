import java.util.*;

public class BuyAndSellStock {

    // Function to implement
    public static int maxProfit(int[] prices) {
        
        // Your logic here
        int min_price = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices){
            if(price < min_price){
                min_price = price ;
            }
            
            profit = Math.max(profit , price-min_price);
            
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input prices
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Call function
        int profit = maxProfit(prices);

        // Output result
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}