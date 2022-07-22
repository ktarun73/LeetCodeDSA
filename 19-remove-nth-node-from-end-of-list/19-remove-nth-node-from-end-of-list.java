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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        
        ListNode dummy=new ListNode(-1,head);
        ListNode prev=dummy;
        temp=head;
        int i=len-n;
        while(i>0 && temp!=null){
            prev=prev.next;
            temp=temp.next;
            i--;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}