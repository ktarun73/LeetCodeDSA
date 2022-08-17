class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String sentence:sentences){
            int temp=1;
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==' ') temp++;
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}