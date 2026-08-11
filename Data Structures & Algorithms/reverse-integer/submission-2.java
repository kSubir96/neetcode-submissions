class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean negative = s.charAt(0) == '-';

        String res = negative
                ? new StringBuilder(s.substring(1)).reverse().toString()
                : new StringBuilder(s).reverse().toString();

        // Remove leading zeros
        res = res.replaceFirst("^0+", "");

        if (res.isEmpty()) {
            return 0;
        }

        String limit = negative
                ? "2147483648"
                : "2147483647";

        if (res.length() > limit.length() ||
            (res.length() == limit.length() && res.compareTo(limit) > 0)) {
            return 0;
        }

        int result = Integer.parseInt(res);

        return negative ? -result : result;
    }
}