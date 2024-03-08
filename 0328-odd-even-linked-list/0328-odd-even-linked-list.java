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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode curr = head;
        ListNode currE = even;
        ListNode currO = odd;
        int counter = 1;
        while(curr != null){
            if(counter%2 == 0){
                currE.next = curr;  
                curr = curr.next;
                currE = currE.next;
                currE.next = null;
            } 
            else{
                currO.next = curr;
                curr = curr.next;
                currO = currO.next;
                currO.next = null;
            } 
            counter++;
        }
        currO.next = even.next;
        return odd.next;
    }
}