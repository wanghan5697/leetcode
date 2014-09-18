package online;

public class BestTimeToBuyandSellStock2 {
	
	//Design an algorithm to find the maximum profit. You may complete as many transactions 
	//as you like (ie, buy one and sell one share of the stock multiple times). 
	//However, you may not engage in multiple transactions at the same time 
	//(ie, you must sell the stock before you buy again).
	//可以多次交易，在数组里面取递增的子序列。
	
	public int maxProfit(int[] prices){
		if(prices.length<=1){   // 判断非法条件
			return 0;
		}
		int maxProfit=0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i+1]-prices[i]>0)     //在数组里面取递增的子序列。
				maxProfit+=prices[i+1]-prices[i];
		}
		return maxProfit;
		
	}

}
