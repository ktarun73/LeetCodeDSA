class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                list.add(i);
            }
            
        }
        return list;
    }
}