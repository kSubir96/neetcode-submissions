class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) {
            return 0;
        }
        int st = 0, en = 1, n = prices.length, sp = prices[0];
        int res = 0;

        while(en<n) {
            if(prices[en]> sp) {
                res = Math.max(res,prices[en]- sp);
            }
            if(prices[en]<sp) {
                sp = prices[en];
            }
            en++;
        }
        return res;
    }
}
