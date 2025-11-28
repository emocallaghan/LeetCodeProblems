// Last updated: 11/27/2025, 9:29:56 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode solution = new ListNode(0, head);
        while(head!=null && head.next!=null){
            if(head.next.val == head.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return solution.next;
    }
}