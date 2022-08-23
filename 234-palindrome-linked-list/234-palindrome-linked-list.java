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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode mid=mid(head);
        ListNode rev=rev(mid);
        
        while(rev!=null){
            if(head.val!=rev.val) return false;
            System.out.print(head.val+" ");
            System.out.print(rev.val+" ");
            head=head.next;
            rev=rev.next;
        }
        return true;
        
    }
    
    ListNode mid(ListNode head){
        ListNode slow=head , fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    ListNode rev(ListNode head){
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