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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;

        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }

    }
     public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null &&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
     }
     public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode present=head;
        

        while(present!=null){
            ListNode next =present.next;
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }    
}