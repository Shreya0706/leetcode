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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
		
		ListNode sortTail = head;
		ListNode unsortHead = head.next;
		
		while (unsortHead != null){
			
			ListNode sortHead = head;
			ListNode sortHeadPre = null;
			
			// Search for a place to insert
			while (sortHead.val < unsortHead.val && sortHead != unsortHead) {
				sortHeadPre = sortHead;
				sortHead = sortHead.next;
			}
			
			// Insert
			ListNode unsortNext = unsortHead.next;
			if (sortHead != unsortHead) {
				unsortHead.next = sortHead;
				sortTail.next = unsortNext;
				if (sortHeadPre == null) {
					head = unsortHead;
				} else {
					sortHeadPre.next = unsortHead;
				}
			} else {
				sortTail = sortHead;
			}
			unsortHead = unsortNext;
		}
		
		return head;
        
    }
}