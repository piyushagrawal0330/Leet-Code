class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode nn = new ListNode();
        head = nn;

        int sum = 0;
        while(node != null) {
            sum += node.val;
            if(node.val == 0) {
                nn.next = new ListNode(sum);
                nn = nn.next;
                sum = 0;
            }
            node = node.next;
        }
        return head.next;
    }
}