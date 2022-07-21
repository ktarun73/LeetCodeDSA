class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long nm=n;
        if(nm<0) nm*=-1;
        while(nm>0){
            if(nm%2==1){
                ans=ans*x;
                nm-=1;
            }
            else{
                
                x=x*x;
                nm/=2;
            }
        }
        
        if(n<0) return (double)(1)/(double)(ans);
        return ans;
    }
}