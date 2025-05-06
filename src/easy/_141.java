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


public class ListNode {
     public int val;
      public ListNode next;
      public ListNode(int x) {
          val = x;
          next = null;
      }
  }