package medium;

import java.util.Arrays;

public class _6 {

    public String convert(String s, int numRows) {
        char[][] rows = new char[numRows][s.length()];

        int row = 1;
        int col = 0;
        int prev = 0;


        for (int i = 0; i < s.length(); i++) {
            rows[prev][col] = s.charAt(i);

            if (prev < row) {
                prev = row;
                row++;
            } else {
                row--;
                prev = row;
            }
            if (row == numRows) {
                row--;
                prev = row;
                col++;
            }
            if (row == 0) {
                row++;
                col++;
            }


        }

        String[] resultArray = new String[numRows];
        int count = 0;
        for (char[] raw : rows) {
            
            resultArray[count] = Arrays.toString(raw);
            count++;
        }

        String finalResult = "";

        for (String raw : resultArray) {
            finalResult += raw;
        }

        return finalResult;

    }
}
