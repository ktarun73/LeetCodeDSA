class Solution {
    public String reverseWords(String s) {
        if(s.length()==1) return s;
        String ans="";
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                while(i>=0 && s.charAt(i)==' ') i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(ans.isEmpty()){
                ans+=s.substring(i+1,j+1);
            } else{
                ans+=" "+ s.substring(i+1,j+1);
            }
            
        }
        return ans;
    }
}