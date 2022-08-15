class Solution {
    public int romanToInt(String s) {
        char[] ar=s.toCharArray();
        int ans=0;
        for(int i=ar.length-1;i>=0;i--){
            if(i-1>-1){
                if(ar[i]=='V' && ar[i-1]=='I') {
                    ans+=4;
                    i--;
                    continue;
                }
                else if(ar[i]=='X' && ar[i-1]=='I'){
                    ans+=9;
                    i--;
                    continue;
                }
                else if(ar[i]=='L' && ar[i-1]=='X'){
                    ans+=40;
                    i--;
                    continue;
                }
                else if(ar[i]=='C' && ar[i-1]=='X'){
                    ans+=90;
                    i--;
                    continue;
                }
                else if(ar[i]=='D' && ar[i-1]=='C'){
                    ans+=400;
                    i--;
                    continue;
                }
                else if(ar[i]=='M' && ar[i-1]=='C'){
                    ans+=900;
                    i--;
                    continue;
                }
            }
            if(i>-1){
                if(ar[i]=='I') ans+=1;
                else if(ar[i]=='V') ans+=5;
                else if(ar[i]=='X') ans+=10;
                else if(ar[i]=='L') ans+=50;
                else if(ar[i]=='C') ans+=100;
                else if(ar[i]=='D') ans+=500;
                else if(ar[i]=='M') ans+=1000;
            }
        }
        return ans;
    }
    
}