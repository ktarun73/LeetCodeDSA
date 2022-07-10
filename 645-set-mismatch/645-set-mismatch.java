class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] ar=new int[2];
        int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]==nums[correct]){
                i++;
                continue;
            }
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                ar[0]=nums[i];
                ar[1]=i+1;
            }
        }
        
        return ar;
        
    }
    
    void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}