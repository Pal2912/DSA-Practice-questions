package Math;

class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Handle sign
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Use long to prevent overflow, and take absolute values
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // Double the divisor (by multiplication) until it exceeds dividend
            while (dvd >= temp + temp) {
                temp = temp + temp;         // Same as temp *= 2, but no bit shift
                multiple = multiple + multiple;
            }

            dvd -= temp;
            result += multiple;
        }

        return isNegative ? -result : result;
    }
}

