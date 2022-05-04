class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxPrices[]=new int[n];
        int maxPrice=prices[n-1];
        maxPrices[n-1]=maxPrice;
        for(int i=n-2;i>=0;i--){
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
            }
            maxPrices[i]=maxPrice;
        }
        
         int maxProfit=0;
        for(int i=0;i<n;i++){
            int temp=maxPrices[i]-prices[i];
            if(maxProfit<temp){
                maxProfit=temp;
            }
        }
        return maxProfit;
    }
}