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
    
    public int size(ListNode head){
        int n = 0;
        while(head!=null){
            n++;
            head = head.next;
        }
        return n;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int n = size(head);
        int loop = k%n;
        loop = n-loop;
        if(n==1|| loop==n){
            return head;
        }
        int j = 0;
        
        ListNode temp = head;
        ListNode firstAdd = head;
        
        while(temp!=null){
            j++;
            while(j==loop){
                firstAdd = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        temp = firstAdd;
        while(temp.next!=null){
            temp = temp.next;
        
        }
        temp.next = head;
        return firstAdd;
    }
}