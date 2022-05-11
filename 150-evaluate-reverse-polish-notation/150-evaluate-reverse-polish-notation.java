class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!isOperator(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else{
                int num1=stack.pop();
                int num2=stack.pop();
                operation(stack , num1 , num2 , tokens[i]);
            }
            
        }
        return stack.pop();
        }
        public boolean isOperator(String s){
            return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
        }
        
        public void operation(Stack<Integer> stack, int num1, int num2, String s){
            if(s.equals("+")){
                 stack.push(num1+num2);
            }
            else if(s.equals("-")){
             stack.push(num2-num1);
            }
            else if(s.equals("*")){
             stack.push(num1*num2);
            }
            else if(s.equals("/")){
             stack.push(num2/num1);
            }
            
            
        }
    
}