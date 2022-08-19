class Solution {
    public String capitalizeTitle(String title) {
        String[] splitTitle=title.split("\\s");
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(String str:splitTitle){
            if(str.length()<=2) {
                if(i<splitTitle.length-1)  sb.append(str.toLowerCase()+" ");
                else  sb.append(str.toLowerCase());
                i++;
            }
            else{
                str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
                if(i<splitTitle.length-1) sb.append(str+" ");
                else sb.append(str);
                i++;
            }
        }
        return sb.toString();
    }
}