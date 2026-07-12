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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode gh = new ListNode(0);
        ListNode track = gh;
        while(list1 != null && list2 != null) {
            // System.out.println("list1: "+list1.val+" , list2: "+list2.val);
            if(list1.val <= list2.val) {
                gh.next =  list1;
                list1 = list1.next;
            } else {
                gh.next = list2;
                list2 =list2.next;
            }
            gh = gh.next;
            gh.next = null;
            // System.out.println("FInal list1: "+list1.val+" , list2: "+list2.val);
        }
        if(list1 != null) {
            gh.next = list1;
        }
        if(list2 != null) {
            gh.next = list2;
        }
        return track.next;
    }
}