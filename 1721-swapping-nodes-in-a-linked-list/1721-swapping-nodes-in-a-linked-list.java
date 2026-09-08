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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode first=temp;
        temp=head;
        for(int i=1;i<(count-k+1);i++){
            temp=temp.next;
        }
        ListNode second=temp;
        int prev=first.val;
        first.val=second.val;
        second.val=prev;
        return head;
    }
}