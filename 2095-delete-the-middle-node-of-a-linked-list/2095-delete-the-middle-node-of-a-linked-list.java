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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode hear = head;
        ListNode turtle = head;
        ListNode prev = head;
        while(hear != null && hear.next != null){
            turtle = turtle.next;
            hear = hear.next.next;
        }
        while(prev.next != turtle){
            prev = prev.next;
        }
        prev.next = turtle.next;
        return head;
    }
}