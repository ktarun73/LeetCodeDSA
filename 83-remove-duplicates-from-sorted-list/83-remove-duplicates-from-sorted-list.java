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
        ListNode curNode=head , lastNode=head.next;
        while(lastNode!=null){
            if(curNode.val==lastNode.val){
                curNode.next=lastNode.next;
            }else{
                curNode=curNode.next;
            }
            lastNode=lastNode.next;
        }
        
        return head;
    }
}