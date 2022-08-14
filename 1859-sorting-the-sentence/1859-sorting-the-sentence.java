class Solution {
    public String sortSentence(String s) {
        String[] ar=s.split(" ");
        String[] ans=new String[ar.length];
        for(String str:ar){
            int n=str.charAt(str.length()-1) - '0';
            ans[n-1]=str.substring(0,str.length()-1);
        }
        StringBuilder string=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            if(i==ans.length-1) string.append(ans[i]);
            else string.append(ans[i]).append(" ");
        }
        return string.toString();
    }
}