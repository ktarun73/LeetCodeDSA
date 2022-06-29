class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);
        return ans;
    }
    
    public int binarySearch(int[] nums,int target,boolean isStart){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int pivot=start+(end-start)/2;
            if(nums[pivot]>target){
                end=pivot-1;
            }
            else if(nums[pivot]<target){
                start=pivot+1;
            }
            else{
                ans=pivot;
                if(isStart){
                    end=pivot-1;
                }
                else{
                    start=pivot+1;
                }
            }
        }
        return ans;
    }
}