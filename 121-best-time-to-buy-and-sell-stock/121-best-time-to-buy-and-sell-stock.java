class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxPrices[]=new int[n];
        int maxPrice=prices[n-1];
        for(int i=n-1;i>=0;i--){
            if(maxPrice<prices[i]){
                maxPrice=prices[i];
            }
            maxPrices[i]=maxPrice;
        }
        
        int maxProfit=0;
        for(int i=0;i<n;i++){
            int temp=maxPrices[i]-prices[i];
            if(temp>maxProfit){
                maxProfit=temp;
            }
        }
        return maxProfit;
    }
}