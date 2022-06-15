class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int in=Math.abs(nums[i]);
            if(nums[in]<0){
                return in;
            }
            nums[in]*=-1;
        }
        return -1;
    }
}