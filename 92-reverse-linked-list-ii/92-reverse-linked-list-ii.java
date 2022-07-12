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
        
        if(head==null || head.next==null) return head;
        
        ListNode dummy=new ListNode(-1,head);
        
        ListNode leftNode=head , l_prev=dummy;
        
        while(left>1){
            leftNode=leftNode.next;
            l_prev=l_prev.next;
            left--;
        }
        
        ListNode rightNode=head , r_next=head.next;
        
        while(right>1){
            rightNode=rightNode.next;
            r_next=r_next.next;
            right--;
        }
        
        l_prev.next=null;
        rightNode.next=null;
        ListNode temp=reverseList(leftNode);
        
        l_prev.next=temp;
        
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        
        cur.next=r_next;
        return dummy.next;
        
        
        
    }
    
    public ListNode reverseList(ListNode head) {
        
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