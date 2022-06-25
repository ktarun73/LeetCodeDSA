class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        long j=num;
        while(i<=j){
            long mid=i+(j-i)/2;
            long mul=mid*mid;
            if(mul==num) return true;
            if(mul>num) j=mid-1;
            else i=mid+1;
        }
        return false;
    }
}