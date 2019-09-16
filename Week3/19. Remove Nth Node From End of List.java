class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next= head;
        ListNode first = node; ListNode second = node;
        for(int i=0;i<n;i++)
            first = first.next;
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        second.next= second.next.next;

    return node.next;
    }
}