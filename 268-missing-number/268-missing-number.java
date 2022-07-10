class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) return i;
        }
        return nums.length;
    }
    
    public void sort(int[] ar){
        int i=0;
        while(i<ar.length){
            
            if(ar[i]<ar.length && ar[i]!= ar[ar[i]]){
                swap(ar,i,ar[i]);
            }
            else{
                i++;
            }
        }
    }
    
    public void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}