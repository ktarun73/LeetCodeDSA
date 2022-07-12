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
        int a=0;
        int b=0;
        ListNode cur1=headA , cur2=headB;
        
        while(cur1!=null){
            a++;
            cur1=cur1.next;
        }
        
        while(cur2!=null){
            b++;
            cur2=cur2.next;
        }
        
        cur1=headA;
        cur2=headB;
        
        if(b>a){
            int temp=b-a;
            while(temp!=0){
                temp--;
                cur2=cur2.next;
            }
        }
        else{
            int temp=a-b;
            while(temp!=0){
                temp--;
                cur1=cur1.next;
            }
        }
        
        while(cur1!=null || cur2!=null){
            if(cur1==cur2){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        
        return null;
        
    }
}