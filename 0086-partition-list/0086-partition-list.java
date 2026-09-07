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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode greater=new ListNode(0);
        ListNode smaller=new ListNode(0);
        ListNode temp=head;
        ListNode small=smaller;
        ListNode great=greater;
        while(temp!=null){
            if(temp.val>=x){
                great.next=temp;
                great=great.next;
            }
            else{
                small.next=temp;
                small=small.next;
            }
            temp=temp.next;
        }
        great.next=null;
        small.next=greater.next;
        return smaller.next;
    }
}