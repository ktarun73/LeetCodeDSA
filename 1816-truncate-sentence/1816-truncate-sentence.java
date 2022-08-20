class Solution {
    public String truncateSentence(String s, int k) {
        String[] splited=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            if(i<k-1){
                sb.append(splited[i]+" ");
            } else{
                sb.append(splited[i]);
            }
            
        }
        return sb.toString();
    }
}