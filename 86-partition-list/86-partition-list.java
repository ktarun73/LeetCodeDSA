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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        
        ListNode left=new ListNode(-1);
        ListNode right=new ListNode(-1);
        ListNode cur=head , cur1=left , cur2=right;
        while(cur!=null){
            ListNode newNode=new ListNode(cur.val);
            if(cur.val<x){
                cur1.next=newNode;
                cur1=cur1.next;
            }
            else{
                cur2.next=newNode;
                cur2=cur2.next;
                cur2.next=null;
            }
            cur=cur.next;
        }
        right=right.next;
        cur1.next=right;
        left=left.next;
        return left;
    }
}