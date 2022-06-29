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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList <Integer> al = new ArrayList<Integer>(); 
        for(int i=0;i<lists.length;i++){
           ListNode ptr = lists[i];
           while(ptr!=null){
               al.add(ptr.val);
               ptr=ptr.next;
           }
        }
        ListNode ptr1=null;
        Collections.sort(al);
        ListNode head2 = null;
        ptr1 = head2;
        for(int i=0;i<al.size();i++){
            ListNode temp = new ListNode();
            temp.val = al.get(i);
            temp.next = null;
            if(head2 == null){
                head2 = temp;
                ptr1 = head2;
            }
            else{
                ptr1.next = temp;
                ptr1 = ptr1.next;
            }
        }
        return head2;
    }
}