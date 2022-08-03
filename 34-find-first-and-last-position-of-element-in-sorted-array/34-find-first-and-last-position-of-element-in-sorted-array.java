class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);
        return ans;
    }
    
    int binarySearch(int[] nums, int target,boolean isStart){
        int ans=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]<target) i=mid+1;
            else if(nums[mid]>target) j=mid-1;
            else{
                ans=mid;
                if(isStart){
                    j=mid-1;
                }
                else{
                  i=mid+1;
                }
            }
        }
        return ans;
    }
}