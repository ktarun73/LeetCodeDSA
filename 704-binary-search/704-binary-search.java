class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
        
    }
    
    public int binarySearch(int[] ar,int target,int start,int end){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(ar[mid]==target) return mid;
        if(ar[mid]>target) return binarySearch(ar,target,0,mid-1);
        return binarySearch(ar,target,mid+1,end);
    }
}