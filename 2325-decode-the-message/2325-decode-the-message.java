class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character , Character> map=new HashMap<>();
        char c=97;
        for(char ch:key.toCharArray()){
            if(ch==' ') continue;
            if(!map.containsKey(ch)){
                map.put(ch,c);
                c++;
            } 
        }
        System.out.println(map);
        StringBuilder sb=new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch==' ') sb.append(' ');
            else sb.append(map.get(ch));
        }
        return sb.toString();
    }
}