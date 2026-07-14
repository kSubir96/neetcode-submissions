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
    public boolean hasCycle(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;

        while(fs != null) {
            sl = sl.next;
            if(fs.next == null) return false;
            fs = fs.next.next;

            if(sl == fs) return true;
        }
        return fs == null ? false:true;
    }
}
