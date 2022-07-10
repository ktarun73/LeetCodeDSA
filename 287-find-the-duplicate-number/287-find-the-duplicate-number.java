class Solution {
    public int findDuplicate(int[] ar) {
        
        int i=0;
        while(i<ar.length){
            int correct=ar[i];
            if(ar[i]==ar[correct]) return ar[i];
            if(ar[i]!=ar[correct]){
                swap(ar,i,correct);
            }
            else{
                i++;
            }
        }
        
        return -1;
        
    }
    
    void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}