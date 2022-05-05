class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        if(n<3) return res;
        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int val1=nums[i];
            int target=0-val1;
            List<List<Integer>> subRes=twoSum(nums,i+1,n-1,target);
            for(List<Integer> list:subRes){
                list.add(val1);
                res.add(list);
            }
        }
        
        return res;
    }
    
    public List<List<Integer>> twoSum(int[] nums,int si,int ei,int target){
        int left=si;
        int right=ei;
        List<List<Integer>> res=new ArrayList<>();
        while(left<right){
            if(left!=si && nums[left]==nums[left-1]){
                left++;
                continue;
            }
            int sum=nums[left]+nums[right];
            if(sum==target){
                List<Integer> subRes=new ArrayList<>();
                subRes.add(nums[left]);
                subRes.add(nums[right]);
                res.add(subRes);
                left++;
                right--;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        
        return res;
    }
}