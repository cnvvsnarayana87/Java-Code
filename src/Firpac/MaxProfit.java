/* Return the maximum profit by choosing a single day to buy and a different day in the 
 * future to sell.*/
package firpac;

import java.util.Arrays;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = {2,4,1};//{ 7, 5, 1, 3, 6, 4, 1 };
		int profit = calculateMaxProfit(prices);
		if (profit > 0) {
			System.out.println("Profit Earned : " + profit);
		} else {
			System.out.println("No Profit Earned");
		}
	}

	public static int calculateMaxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		} else {
			int minPrice = Arrays.stream(prices).min().getAsInt();						
			int indexOfMinPrice = 0;
			for (int i = 0; i < prices.length; i++) {
				if (prices[i] == minPrice) {
					indexOfMinPrice = i;
					break;
				}
			}
			int[] remainingPrices = Arrays.copyOfRange(prices, indexOfMinPrice, prices.length);
			int minRemainingPrice = Arrays.stream(remainingPrices).min().getAsInt();
			int maxRemainingPrice = Arrays.stream(remainingPrices).max().getAsInt();
			int profit = maxRemainingPrice - minRemainingPrice;
			return profit;
		}
	}
}
