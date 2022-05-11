class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isAsc=nums[0]<nums[nums.length-1];
        return ans(nums,isAsc);
        
    }
    public boolean ans(int[] nums, boolean isAsc){
        Stack<Integer> stack=new Stack<>();
        if(isAsc){
            for(int i:nums){
            if(!stack.isEmpty() && stack.peek()>i){
                return false;
            }
            stack.push(i);
        }
        return true;
        }
        for(int i:nums){
            if(!stack.isEmpty() && stack.peek()<i){
                return false;
            }
            stack.push(i);
        }
        return true;
    }
}