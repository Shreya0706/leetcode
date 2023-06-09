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
    public int getDecimalValue(ListNode head) {
        String d="";
        while(head!=null){
            d+=head.val;
            head=head.next;
        }
        int ans=Integer.parseInt(d,2);
        return ans;
    }
}