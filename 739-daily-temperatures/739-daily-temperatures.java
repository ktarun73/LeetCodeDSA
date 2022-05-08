class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n=temps.length;
        Stack<Integer> stack=new Stack();
        
        for(int i=0;i<n;i++){
            
            while(!stack.isEmpty() && temps[i]>temps[stack.peek()]){
                int k=stack.pop();
                temps[k]=i-k;
            }
            
            
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            temps[stack.pop()] = 0;
        }
        temps[n-1]=0;
        return temps;
    }
}