class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0]==ch){
                stack.peek()[1]++;
            }else{
                stack.push(new int[]{ch,1});
            }
            if(stack.peek()[1]==k){
                stack.pop();
            }
        }
        
        StringBuilder string=new StringBuilder();
        while(!stack.isEmpty()){
            int[] top=stack.pop();
            while(top[1]>0){
                string.append((char)top[0]);
                top[1]--;
            }
        }
        
        return string.reverse().toString();
    }
}