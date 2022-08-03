class MyCalendar {
    HashMap<Integer,Integer> map;

    public MyCalendar() {
        map=new HashMap<>();
    }
    
    public boolean book(int start, int end) {
        if(map.isEmpty()){
            map.put(start,end);
            return true;
        }
        for(int i:map.keySet()){
            
            if(Math.max(start,i)<Math.min(end,map.get(i)))
            {
                return false;
            }
        }
        map.put(start,end);
        return true;
        
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */