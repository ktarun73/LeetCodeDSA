class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j];
            j++;
        }
        bubbleSort(nums1);
    }
    
    public void bubbleSort(int[] ar){
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(ar[j]<ar[j-1]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }
    }
}