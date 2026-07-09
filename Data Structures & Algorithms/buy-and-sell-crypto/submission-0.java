class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int n=prices.length, buyPrice=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            int currProfit= prices[i]-buyPrice;
            maxProfit=Math.max(currProfit,maxProfit);
        }
        return maxProfit;
    }
}
