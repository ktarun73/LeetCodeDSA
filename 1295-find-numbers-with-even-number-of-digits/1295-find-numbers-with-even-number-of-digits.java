class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(isEvenDigit(i)){
                count++;
            }
        }
        return count;
    }
    
    public boolean isEvenDigit(int num){
        int x=digits(num);
        if(x%2==0){
            return true;
        }
        return false;
    }
    
    public int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}