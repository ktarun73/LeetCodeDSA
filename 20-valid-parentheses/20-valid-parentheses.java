class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else if(s.isEmpty()) return false;
            else if(!s.isEmpty() && ch==')' && s.pop()!= '(') return false;
            else if(!s.isEmpty() && ch=='}' && s.pop()!= '{') return false;
            else if(!s.isEmpty() && ch==']' && s.pop()!= '[') return false;
            
        }
        return s.isEmpty();
    }
}