class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]<nums[j]){
                maxProfit+=nums[j]-nums[i];
            }
        }
        return maxProfit;
    }
}