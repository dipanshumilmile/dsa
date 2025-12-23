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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int splitSize = n/k;
        int remSize = n%k;
        ListNode[] ans=new ListNode[k];
        ListNode curr = head;

        for(int i=0; i<k; i++){
            ans[i]=curr;
            ListNode newHead=curr;
            int partSize=splitSize;
            if(remSize>0) {
                partSize++;
                remSize--;
            }
            ListNode prev = null;
            for(int j=1; j<partSize && curr!=null; j++){
                curr=curr.next;
            }
            if(curr!=null){
                ListNode next = curr.next;
                curr.next=null;
                curr=next;
            }

           
            
            
            
            
        }
        return ans;

    }
}