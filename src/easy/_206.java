package easy;

public class _206 {

    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode dummy = null;
        ListNode current = new ListNode(head.val, head.next);

        while (current != null) {
            next = current.next;
            current.next = dummy;
            dummy = current;
            current = next;
        }

        return dummy;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}



