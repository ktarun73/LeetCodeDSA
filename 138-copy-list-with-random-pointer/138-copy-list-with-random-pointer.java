/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        HashMap<Node,Node> map=new HashMap<>();
        Node ans=new Node(-1);
        Node cur=head , cur1=ans;
        while(cur!=null){
            Node newNode=new Node(cur.val);
            cur1.next=newNode;
            map.put(cur,newNode);
            cur1=cur1.next;
            cur=cur.next;
        }
        ans=ans.next;
        cur=head;
        cur1=ans;
        
        while(cur1!=null){
            cur1.random=map.get(cur.random);
            cur1=cur1.next;
            cur=cur.next;
        }
        return ans;
    }
}