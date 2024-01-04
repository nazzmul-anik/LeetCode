class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, profit = 0;
        int buyDay = prices[0];

        for(int i=1; i<prices.length; i++){
            if(prices[i] < buyDay){
                buyDay = prices[i];
            }
            else if(prices[i] > buyDay){
                profit = prices[i]-buyDay;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }
}