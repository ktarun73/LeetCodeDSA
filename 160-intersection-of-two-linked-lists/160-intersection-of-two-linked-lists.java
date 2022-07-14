/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a_len=0 , b_len=0;
        ListNode cur1=headA , cur2=headB;
        
        while(cur1!=null){
            a_len++;
            cur1=cur1.next;
        }
        
        while(cur2!=null){
            b_len++;
            cur2=cur2.next;
        }
        
        cur1=headA;
        cur2=headB;
        
        if(a_len<b_len){
            int skip=b_len-a_len;
            while(skip!=0){
                cur2=cur2.next;
                skip--;
            }
        }
        
        else{
            int skip=a_len-b_len;
            while(skip!=0){
                cur1=cur1.next;
                skip--;
            }
        }
        
        while(cur1!=null && cur2!=null){
            if(cur1==cur2) return cur1;
            cur1=cur1.next;
            cur2=cur2.next;
        }
        
        return null;
        
    }
}