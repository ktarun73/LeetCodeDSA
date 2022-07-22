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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len<k) k=k%len;
        while(k>0){
            ListNode prev=head, cur=head.next;
            while(cur.next!=null){
                prev=prev.next;
                cur=cur.next;
            }
            prev.next=null;
            cur.next=head;
            head=cur;
            k--;
        }
        return head;
    }
}