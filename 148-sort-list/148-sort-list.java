/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        
        Collections.sort(list);
        
        return list(list);
        
    }
    
    public ListNode list(ArrayList<Integer> list){
        ListNode head=new ListNode(list.get(0));
        ListNode cur=head;
        for(int i=1;i<list.size();i++){
            ListNode newNode=new ListNode(list.get(i));
            cur.next=newNode;
            cur=cur.next;
        }
        return head;
    }
}