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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        if(head==null || k==1) return head;

        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode nex = dummy;

        int length = 0;
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }

        while(length>=k){
            curr = prev.next;
            nex = curr.next;

            for(int i=1;i<k;i++){
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            length = length - k;
        }
        return dummy.next;
    }
}