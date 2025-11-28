// Last updated: 11/27/2025, 9:30:12 PM
 /*public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }*/
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode index = new ListNode();
        ListNode solution = index;
        int val = 0;
        int carry = 0;
        while(l1 !=null || l2 != null || carry !=0){
            val = carry;
            if(l1 != null){
                val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                val += l2.val;
                l2 = l2.next;
            }
            if(val>9){
                carry = val/10;
                val = val%10;
            } else{
                carry = 0;
            }
            index.next = new ListNode(val);
            index = index.next;
        }
        return solution.next;
    }
}