package Grind75;

import java.util.ArrayList;

public class MyToi {
    public int myAtoi(String s) {
        char[] stringArr = s.toCharArray();
        int i = 0;
        int n = stringArr.length;

        while (i < n && stringArr[i] == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && (stringArr[i] == '+' || stringArr[i] == '-')) {
            if (stringArr[i] == '-') {
                sign = -1;
            }
            i++;
        }

        long result = 0;
        while (i < n && isNumber(stringArr[i])) {
            int digit = stringArr[i] - '0';
            result = result * 10 + digit;

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }

    private boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }
}