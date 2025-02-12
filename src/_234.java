import java.util.ArrayList;

public class twothreefour {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        while(head.next != null) {
            array.add(head.val);
            head = head.next;
        }
        array.add(head.val);
        int left = 0;
        int right = array.toArray().length - 1;
            System.out.println();
        while (left < right) {
            if (array.get(left)!= array.get(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }

        return true;
    }
}
