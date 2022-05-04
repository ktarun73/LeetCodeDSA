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
    public ListNode removeElements(ListNode head, int val) {
     if(head==null){
         return head;
     }
        if(head.val==val){
            while(head.val==val && head!=null){
                head=head.next;
                if(head==null){
                    return head;
                }
            }
        }
        ListNode curNode=head;
        while(curNode.next!=null){
            if(curNode.next.val==val){
                curNode.next=curNode.next.next;
            }else{
                curNode=curNode.next;
            }
            
        }
        return head;
    }
}