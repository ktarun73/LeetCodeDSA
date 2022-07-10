class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    
    void sort(int[] ar){
        int i=0;
        while(i<ar.length){
            int correct=ar[i]-1;
            if(ar[i]!=ar[correct]){
                swap(ar,i,correct);
            }
            else{
                i++;
            }
        }
    }
    
    void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}