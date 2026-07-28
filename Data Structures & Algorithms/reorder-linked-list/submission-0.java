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
    static ListNode reverse(ListNode rhead){
        ListNode prev=null;
        ListNode curr=rhead;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        if(head==null||head.next==null){
            return;
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow.next);
        slow.next=null;

        while(temp!=null&& second!=null){
            ListNode next1=temp.next;
            ListNode next2=second.next;

            temp.next=second;
            second.next=next1;

            temp=next1;
            second=next2;
        }
    }
}
