package online;

public class BestTimeToBuyandSellStock {
	/*
	 * Say you have an array for which the ith element is the price of a given
	 * stock on day i. If you were only permitted to complete at most one
	 * transaction (ie, buy one and sell one share of the stock), design an
	 * algorithm to find the maximum profit.
	 */
	// 一个数组存的一只股票每天收盘价，只允许一次买卖，如何得到最大利润
	// 从前往后，用当前价格减去此前最低价格，就是在当前点卖出股票能获得的最高利润。
	// 扫描的过程中更新最大利润和最低价格就行了。

	public int maxProfit(int[] prices) {
		if (prices.length <= 1) { // 判断非法条件
			return 0;
		}
		int min = prices[0]; // min 用来记录最低价
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - min; // 当前遍历的元素和之前的最低价之间的差价就是当前的利润

			if (prices[i] < min) { // 如果找到有比min小的，则更新当前的min值。
				min = prices[i];
			}
			if (maxProfit < profit) { // 更新当前的最大利润
				maxProfit = profit;
			}
		}
		return maxProfit;

	}

}
