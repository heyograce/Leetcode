class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode point = node;
        while(point.next!=null && point.next.next!=null){
            ListNode first = point.next;
            ListNode second = point.next.next;
            point.next = second;
            first.next= second.next;
            second.next = first;
            point = first;
        }
        return node.next;
    }
}