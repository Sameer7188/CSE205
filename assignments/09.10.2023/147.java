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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

        ListNode l1 = insertionSortList(head);
        ListNode l2 = insertionSortList(slow);

        return merger(l1,l2);
    }
    public ListNode merger(ListNode list1, ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;

        if(list1.val<list2.val){
            list1.next = merger(list1.next,list2);
            return list1;
        }
        else{
            list2.next = merger(list1,list2.next);
            return list2;
        }
    }
}