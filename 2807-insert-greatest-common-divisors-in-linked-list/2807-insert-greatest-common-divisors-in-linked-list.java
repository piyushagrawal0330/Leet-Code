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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            int a = gcd(temp.val,temp.next.val);
            ListNode curr = new ListNode(a);
            curr.next=temp.next;
            temp.next=curr;
            temp=temp.next.next;
            
        }
        return head;
    }
    
    int gcd(int a,int b){
        int c = Math.min(a,b);
        while(c>1){
            if(b%c==0&&a%c==0){
                return c;
            }
            c--;
            
        }
        return c;
        
    }
}