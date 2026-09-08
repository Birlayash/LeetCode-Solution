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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        int max=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=second;
            second=slow;
            slow=temp;
        }
        ListNode first=head;
        ListNode sec=second;
        while(sec!=null){
            int sum=first.val+sec.val;
            max=Math.max(sum,max);
            first=first.next;
            sec=sec.next;
        }
        return max;
    }
}