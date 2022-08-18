class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int ans=0;
        int count=0;
        int i=0;
        while(count*2<arr.length){
            ans++;
            count+=list.get(i);
            i++;
        }
        return ans;
    }
}