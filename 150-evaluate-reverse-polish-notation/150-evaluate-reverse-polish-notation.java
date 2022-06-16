class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(!isOperater(tokens[i])){
                s.push(Integer.parseInt(tokens[i]));
            }
            else{
                int x=s.pop();
                int y=s.pop();
                s.push(operation(tokens[i],x,y));
            }
            
        }
        return s.peek();
    }
    
    public int operation(String s,int x,int y){
        if(s.equals("+")) return x+y;
        else if(s.equals("-")) return y-x;
        else if(s.equals("*")) return x*y;
        else if(s.equals("/")) return y/x;
        return 0;
    }
    
    public boolean isOperater(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}