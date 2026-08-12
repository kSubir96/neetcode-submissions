class Solution {
    public int climbStairs(int n) {
        int p1 = 0, p2 = 1;
        // int res = 

        for (int i = 0; i <= n; i++) {
            int x = p1;
            p1 = p1 + p2;
            p2 = x;
        }
        return p1;
    }
}
