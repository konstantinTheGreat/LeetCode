package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _415 {

    public String addStrings(String num1, String num2) {


        StringBuilder sum = new StringBuilder();

        int j  = 0;
        int carry = 0;

        while (j < num1.length() && j < num2.length()) {

            int num1Digit = num1.charAt(num1.length() - 1 - j) - '0';
            int num2Digit = num2.charAt(num2.length() - 1 - j) - '0';

            sum.append((char)(((num1Digit + num2Digit + carry) % 10) + '0'));

            carry = (num1Digit + num2Digit + carry) / 10;

            j++;
        }

        String largest = num1.length() > num2.length() ? num1 : num2;

        while (j < largest.length()) {
            int numDigit = largest.charAt(largest.length() - 1 - j);
            sum.append((char)(((numDigit + carry) % 10) + '0'));
            carry = (numDigit + carry) / 10;
            j++;
        }

        if (carry != 0) {
            sum.append((char)(carry + '0'));
        }

        return sum.reverse().toString();
    }
}



/* Given two non-negative integers, num1 and num2 represented as string,
return the sum of num1 and num2 as a string.


You must solve the problem without using any built-in library for handling large integers
(such as BigInteger). You must also not convert the inputs to integers directly
 */