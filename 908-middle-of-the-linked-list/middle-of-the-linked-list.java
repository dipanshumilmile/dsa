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
    public ListNode middleNode(ListNode head) {
        ListNode fst = head;
        ListNode slow = head;
        while(fst != null && fst.next!=null){
            fst = fst.next.next;
            slow = slow.next;
        }
        return slow;
    }
}