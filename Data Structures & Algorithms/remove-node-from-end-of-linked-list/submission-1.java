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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode t = head;
        while(head != null) {
            size++;
            head = head.next;
        }
        size -= n;
        ListNode gh = new ListNode(-1);
        gh.next = t;
        ListNode temp = gh;
        
        // System.out.println("s: " + size + ", gh: " + (gh == null ? "null" : gh.val));
        while(size>0 && gh != null) {
            gh = gh.next;
            size--;
        }
        // System.out.println("s: " + size + ", gh: " + (gh == null ? "null" : gh.val));
        if(gh != null && gh.next != null)
            gh.next = gh.next.next;
        return temp.next;
    }
}




