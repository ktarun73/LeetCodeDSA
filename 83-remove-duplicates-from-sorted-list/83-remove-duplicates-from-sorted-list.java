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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode cur=head , last=head.next;
        while(cur.next!=null && cur!=null){
            if(cur.val==last.val){
                cur.next=last.next;
                last=last.next;
            }else{
                cur=cur.next;
            }
            
        }
        
        return head;
        
    }
}