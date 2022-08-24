class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String string=new String(ch);
            if(!map.containsKey(string)){
                map.put(string,new ArrayList<>());
            }
            map.get(string).add(word);
        }
        return new ArrayList<>(map.values());
    }
}