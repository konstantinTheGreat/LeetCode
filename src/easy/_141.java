package easy;

public class _141 {
    public boolean hasCycle(ListNode head) {

        ListNode rabbit = head;
        ListNode turtle = head;

        while (rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if (rabbit == turtle) {
                return true;
            }

        }

        return false;
    }
}


class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }