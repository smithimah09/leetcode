class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int currentBuy=prices[0];
        for(int i=1; i<prices.length;i++){
            if(currentBuy<prices[i]){ // sell the stock every time the next day is more
                maxprofit+= prices[i]-currentBuy;
            }
            currentBuy = prices[i]; 
        }
        return maxprofit;

    }
}
