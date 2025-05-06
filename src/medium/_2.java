package medium;

import easy.ListNode;

import java.math.BigInteger;

public class _2 {

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            BigInteger firstNodeList = listToInt(l1);
            BigInteger secondNodeList = listToInt(l2);

            BigInteger resultNumber = firstNodeList.add(secondNodeList);

            ListNode result = new ListNode(resultNumber.mod(BigInteger.valueOf(10)).intValue());
            resultNumber = resultNumber.divide(BigInteger.valueOf(10));

            ListNode returnedNode = result;

            while (resultNumber.compareTo(BigInteger.ONE) >= 0) {
                returnedNode.next = new ListNode(resultNumber.mod(BigInteger.valueOf(10)).intValue());
                resultNumber = resultNumber.divide(BigInteger.valueOf(10));
                returnedNode = returnedNode.next;
            }


            return result;
        }

        public BigInteger listToInt(ListNode l) {
            BigInteger result = BigInteger.ZERO;
            BigInteger multiplier = BigInteger.ONE;
            while (l != null) {
                result = result.add(BigInteger.valueOf(l.val).multiply(multiplier));
                multiplier = multiplier.multiply(BigInteger.valueOf(10));
                l = l.next;
            }

            return result;
        }
    }
}
