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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        while(head != null){
            while(!st.isEmpty() && head.val > st.peek().val){
                st.pop();
            }
            st.push(head);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(ListNode node : st){
            temp.next = node;
            temp = temp.next;

        }
        temp.next = null;
        return dummy.next;
    }
}