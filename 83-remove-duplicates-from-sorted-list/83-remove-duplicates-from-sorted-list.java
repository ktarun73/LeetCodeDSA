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
        if(head==null || head.next==null) return head;
        
        ListNode prev=head , cur=head.next;
        while(cur!=null){
            if(prev.val==cur.val){
                cur=cur.next;
                prev.next=cur;
            }
            else{
                cur=cur.next;
                prev=prev.next;
            }
        }
        return head;
    }
}