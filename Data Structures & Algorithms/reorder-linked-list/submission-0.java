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
    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            System.out.println("f : "+ fast.val+", s: "+mid.val);
            fast = fast.next.next;
            mid = mid.next;
        }
        
        System.out.println("mid : "+ mid.val);
        ListNode revH = reverseList(mid.next);
        
        mid.next = null;
        
        // System.out.println("rev : "+ revH.val);
        ListNode res = head;
        while(revH != null) {
            System.out.println("h : "+ res.val+", r: "+revH.val);
            ListNode t = res.next;
            ListNode r = revH.next;
            
            res.next = revH;
            revH.next = t;

            res = t;
            revH = r;
            
        }
        // if(res != mid) {
        //     mid.next = res;
        // }
        // if(revH != null) {
        //     mid.next = revH;
        // }

    }
    private ListNode reverseList(ListNode head) {
        ListNode last = null;
        while(head != null) {
            ListNode t = head.next;
            head.next = last;
            last = head;
            head = t;
        }
        return last;
    }
}












