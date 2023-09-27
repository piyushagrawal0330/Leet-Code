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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int s=size-k;
        int i=0;
        int j=0;
        while(i<k-1){
            temp1=temp1.next;
            i++;
        }
        while(j<s){
            temp2=temp2.next;
            j++;
        }
        int c=temp1.val;
        temp1.val=temp2.val;
        temp2.val=c;
        return head;
    }
}