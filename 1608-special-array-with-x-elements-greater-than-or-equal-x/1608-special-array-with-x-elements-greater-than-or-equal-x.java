class Solution {
    public int specialArray(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(i,max);
        }
        if(max==0 && nums.length>0) return -1;
        
        int start=0;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=count(nums,mid);
            if(count==mid){
                return mid;
            }
            if(count>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
      private int count(int[] nums, int k) {
        int count = 0;
        for (int num: nums) {
            if (num >= k) count++;
        }
        return count;
    }
}