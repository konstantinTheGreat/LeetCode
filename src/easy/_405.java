package easy;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class _405 {

    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'a');
        map.put(11, 'b');
        map.put(12, 'c');
        map.put(13, 'd');
        map.put(14, 'e');
        map.put(15, 'f');
        long number = num;
        if (num < 0) {
            number  = num + (long)(Math.pow(2,32));
        }

        while (number != 0) {
            int remainder = (int) (number % 16);
            if (map.containsKey(remainder)){
                sb.append(map.get(remainder));
            } else {
                sb.append(remainder);
            }
            number = number / 16;
        }

        return sb.reverse().toString();
    }
}

/* Given a 32-bit integer num, return a string representing its hexadecimal representation.
For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters,
and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem. */
