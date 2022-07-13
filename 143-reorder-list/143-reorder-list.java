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
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null) return;
        
        ListNode slow=head , fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode next=slow.next;
        next=reverseList(next);
        slow.next=null;
        ListNode cur=head;
        
        
        while(next!=null && cur!=null){
            ListNode temp=cur.next;
            ListNode temp2=next.next;
            cur.next=next;
            next.next=temp;
            cur=temp;
            next=temp2;
            
            
        }

        
    }
    
    
    ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode prev=head , cur=head.next;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=null;
        head=prev;
        return head;
        
    }
}