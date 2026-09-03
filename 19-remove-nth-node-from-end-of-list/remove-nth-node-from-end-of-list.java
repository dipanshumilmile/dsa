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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }       
        int indx = len - n ;
        if(indx == 0) return head.next;
        ListNode curr = head;
        int i=1;
        while(i!=indx && curr!= null){
            i++;
            curr = curr.next;

        }
        if(curr.next != null){
        curr.next = curr.next.next;
        }
        return head;

    }
}