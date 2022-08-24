class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ar=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='(') stack.push(i);
            else if(ar[i]==')' && stack.size()>0) stack.pop();
            else if(ar[i]==')' && stack.size()==0) ar[i]='.';
        }
        while(stack.size()>0){
            ar[stack.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ar.length;i++){
            if(ar[i]!='.') sb.append(ar[i]);
        }
        return sb.toString();
        
    }
}