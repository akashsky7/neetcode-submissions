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
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode midPoint = slow;
        ListNode curr = slow.next;
        while(curr.next != null){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = midPoint.next;
            midPoint.next = temp;
        }

        slow = head;
        fast = midPoint.next;
        midPoint.next = null;
        while(fast != null){
            ListNode temp1 = slow.next;
            ListNode temp2 = fast.next;
            slow.next = fast;
            fast.next = temp1;
            slow = temp1;
            fast = temp2;
            }
    }
}
