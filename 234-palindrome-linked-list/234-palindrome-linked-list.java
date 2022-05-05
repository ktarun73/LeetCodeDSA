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
        if(head==null){
            return true;
        }
        
        ListNode mid=middle(head);
        ListNode rev=revList(mid);
        
        ListNode cur=head;
        while(rev!=null){
            if(rev.val!=cur.val){
                return false;
            }
            cur=cur.next;
            rev=rev.next;
        }
        return true;
        
    }
    
     public ListNode revList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode=head;
        ListNode curNode=head.next;
        while(curNode!=null){
            ListNode nextNode=curNode.next;
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }
    
    public ListNode middle(ListNode head){
        ListNode a_pointer=head;
        ListNode b_pointer=head;
        while(b_pointer!=null && b_pointer.next!=null){
            a_pointer=a_pointer.next;
            b_pointer=b_pointer.next.next;
        }
        return a_pointer;
        
    }
}