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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp1 = head;
ListNode temp2 = head;
ListNode cur = new ListNode(0);
ListNode temp3 = cur;
if(left == 1 && right==1) return head;
int size = 0;
while(temp1!=null) {
size++;
temp1 = temp1.next;
}
int arr[] = new int[size];
int j=0;
while(temp2!=null) {
arr[j++] = temp2.val;
temp2 = temp2.next;
}
int k=0;
ArrayList list = new ArrayList<>();
int k1=left-1;
int k2 = right-1;
for(int i=k1; i<size; i++) {
if(i<k2 && i!=k2) {
int temp= arr[i];
arr[i]=arr[k2];
arr[k2]=temp;
k2--;
}
}
for(int i:arr) {
ListNode t1 = new ListNode(i);
temp3.next = t1 ;
temp3 = t1;
}
return cur.next;
}
void swap(int a,int b) {
int temp= a;
a = b;
b = temp;
    }
}