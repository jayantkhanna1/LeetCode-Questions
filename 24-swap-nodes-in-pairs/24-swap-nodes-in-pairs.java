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
    public ListNode swapPairs(ListNode head) {
        ListNode ptr=head;
        while(ptr != null){
            if(ptr.next == null){
                break;
            }
            int temp = ptr.val;
            ptr.val=ptr.next.val;
            ptr.next.val=temp;
            ptr=ptr.next.next;
        }
        return head;
    }
}