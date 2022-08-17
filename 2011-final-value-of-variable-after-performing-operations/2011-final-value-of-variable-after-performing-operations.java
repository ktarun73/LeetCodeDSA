class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String , Integer> operation=new HashMap<>();
        operation.put("++X",1);
        operation.put("X++",1);
        operation.put("X--",-1);
        operation.put("--X",-1);
        int x=0;
        for(String str:operations){
            x+=operation.get(str);
            // System.out.println(x);
        }
        return x;
    }
}