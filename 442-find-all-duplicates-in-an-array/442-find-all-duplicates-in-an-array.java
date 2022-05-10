class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            if(nums[i]==nums[j]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}