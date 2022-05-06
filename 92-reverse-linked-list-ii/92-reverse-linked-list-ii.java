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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode l=head,l_prev=dummy;
        
        while(left>1 && l!=null){
            l=l.next;
            l_prev=l_prev.next;
            left--;
        }
        
        ListNode r=head,r_next=head.next;
        while(right>1 && r_next!=null){
            r=r.next;
            r_next=r_next.next;
            right--;
        }
        r.next=null;
        
        ListNode ans=revList(l);
        
        l_prev.next=ans;
        ListNode temp=ans;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=r_next;
        
        
        return dummy.next;
    }
    
    public ListNode revList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode cur=head.next , prev=head;
        
        while(cur!=null){
            ListNode next_node=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next_node;
        }
        
        head.next=null;
        head=prev;
        return head;
    }
}