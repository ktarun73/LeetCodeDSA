class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double mn=n;
        double ans=1;
        if(n<0) mn*=-1;
        while(mn>0){
            if(mn%2==0){
                x*=x;
                mn/=2;
            }
            else{
                ans*=x;
                mn--;
            }
        }
        if(n<0) return (double)1/(double)ans;
        return ans;
    }
}