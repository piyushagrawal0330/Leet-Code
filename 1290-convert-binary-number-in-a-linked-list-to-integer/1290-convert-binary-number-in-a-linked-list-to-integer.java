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
        ListNode temp = head;
        
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        temp=head;
        int ans=0;
        while(temp!=null){
            ans=ans+(int)Math.pow(2,s-1)*temp.val;
            temp=temp.next;
            s--;
        }
        return ans;
    }
}