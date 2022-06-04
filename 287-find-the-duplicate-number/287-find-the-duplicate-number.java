class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i]);
            if(nums[j]<0){
                return Math.abs(nums[i]);
            }
            nums[j]*=-1;
        }
        
        return 0;
    }
}