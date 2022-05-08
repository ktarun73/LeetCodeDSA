class Solution {
   public boolean isValid(String s) {
        // if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(char paranth : s.toCharArray()){
            if(paranth =='(' || paranth =='{' || paranth =='['){
                stack.push(paranth);
            }
            else if(stack.isEmpty()) return false;
            else if(paranth ==')' &&  stack.pop() !='(') return false;
            else if(paranth =='}' &&  stack.pop() !='{') return false;
            else if(paranth ==']' &&  stack.pop() !='[') return false;
        }
    return stack.isEmpty();
    }
}