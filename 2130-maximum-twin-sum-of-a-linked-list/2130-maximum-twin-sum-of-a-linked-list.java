class Solution {
    public int pairSum(ListNode head) {
        int i=0;
        ListNode cur=head;
        while(cur!=null){
            i++;
            cur=cur.next;
        }
        if(i==2) return head.val+head.next.val;
        
        ListNode mid=mid(head);
        ListNode rev=rev(mid);
        int maxPairSum=0;
        while(rev!=null){
            maxPairSum=Math.max(head.val+rev.val,maxPairSum);
            head=head.next;
            rev=rev.next;
        }
        return maxPairSum;
    }
    
    ListNode mid(ListNode head){
        ListNode slow=head , fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    ListNode rev(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev=head , cur=head.next;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=null;
        head=prev;
        return head;
    }
}

















