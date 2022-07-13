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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode ans=new ListNode(-1);
        ListNode cur=ans , cur1=list1 , cur2=list2;
        
        while(cur1!=null && cur2!=null){
            if(cur1.val>cur2.val){
                cur.next=cur2;
                cur2=cur2.next;
                cur=cur.next;
            }
            else{
                cur.next=cur1;
                cur1=cur1.next;
                cur=cur.next;
            }
        }
        if(cur1!=null) cur.next=cur1;
        else cur.next=cur2;
        ans=ans.next;
        
        return ans;
        
    }
}