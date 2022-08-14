class Solution {
    public String defangIPaddr(String address) {
        // return address.replace(".","[.]");
        
        StringBuilder sb=new StringBuilder();
        for(char ch:address.toCharArray()){
            if(ch=='.') sb.append("[.]");
            else sb.append(ch);
        }
        return sb.toString();
    }
}