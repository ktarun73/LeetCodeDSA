class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--                           ","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","-                           -.."};
        String[] morseCodes=new String[words.length];
        for(int i=0;i<words.length;i++){
            String word=words[i];
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                int j=ch-97;
                sb.append(codes[j]);
            }
            morseCodes[i]=sb.toString().replaceAll("\\s+","");
        }
        System.out.println(Arrays.toString(morseCodes));
        HashSet<String> set=new HashSet<>();
        for(String str:morseCodes){
            set.add(str);
        }
        System.out.println(set);
        return set.size();
    }
}