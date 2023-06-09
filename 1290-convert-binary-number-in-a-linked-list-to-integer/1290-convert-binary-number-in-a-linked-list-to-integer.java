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
        int ans=0;
        while(head!=null){
            d+=head.val;
            head=head.next;
        }
        int n=d.length();int j=0;
        for(int i=n-1;i>=0;i--){
            String g=""+d.charAt(j++);
            int m=Integer.parseInt(g);
            ans=ans+m*(int)Math.pow(2,i);
        }
        return ans;
    }
}