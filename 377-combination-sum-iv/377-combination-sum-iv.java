class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer[] array=new Integer[target+1];
        return getAnswer(nums,target,array);
    }
	
    public int getAnswer(int[] nums,int target,Integer[] arr){
        if(target==0){ 
			return 1;
		}
		
        if(target<0){ 
			return 0;
		}
		
        if(arr[target]==null){
            arr[target]=0;
			
            for(int i : nums){
                arr[target]+=getAnswer(nums,target-i,arr);
            }
        }
		
        return arr[target];
    }
}