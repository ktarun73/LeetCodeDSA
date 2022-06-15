class Solution {
    public void moveZeroes(int[] nums) {
        int in=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]!=0){
             nums[in]=nums[i];
             in++;
         }   
        }
        for(int i=in;i<nums.length;i++){
            nums[i]=0;
        }
    }
}