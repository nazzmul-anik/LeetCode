class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int arrLength = prices.size();
        int profit = 0, maxProfit = 0;

        int buy = prices[0];
        for (int index=1; index < arrLength; index++){
            if(prices[index] < buy){
                buy = prices[index];
            }else{
                profit = prices[index] - buy;
                maxProfit = max(profit, maxProfit);
            }
        }

        return maxProfit;
    }
};