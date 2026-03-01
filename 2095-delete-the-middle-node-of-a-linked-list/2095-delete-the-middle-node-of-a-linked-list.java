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
        // if(head == null || head.next == null){
        //     return null;
        // }
        // int count = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // int middle = count / 2;

        // ListNode temp2 = head;
        // for(int i = 0;i<middle-1;i++){
        //     temp2 = temp2.next;
        // }
        // temp2.next = temp2.next.next;
        // return head;
        
        if(head == null || head.next == null) return null;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow  = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}