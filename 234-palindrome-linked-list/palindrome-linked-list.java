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
        ListNode mid=middleNode(head);
        ListNode secondHead=reverseList(mid);
        ListNode reverseHead=secondHead;

        while(head!=null && secondHead!=null){
            if(head.val!=secondHead.val){
                break;
            }
            head=head.next;
            secondHead=secondHead.next;
        }
        reverseList(reverseHead);

        return head==null || secondHead==null;
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