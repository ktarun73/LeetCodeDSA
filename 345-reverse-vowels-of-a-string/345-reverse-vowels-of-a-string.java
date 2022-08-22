class Solution {
    public String reverseVowels(String s) {
        Set<Character> vovels=new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');
        vovels.add('A');
        vovels.add('E');
        vovels.add('I');
        vovels.add('O');
        vovels.add('U');
        char[] ch=s.toCharArray();
        int i=0 , j=ch.length-1;
        while(i<j){
            if(!vovels.contains(ch[i])) i++;
            if(!vovels.contains(ch[j])) j--;
            if(vovels.contains(ch[i]) && vovels.contains(ch[j]) ){
                swap(ch,i,j);
                i++;
                j--;
            }
            
        }
        return new String(ch);
    }
    
    void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}