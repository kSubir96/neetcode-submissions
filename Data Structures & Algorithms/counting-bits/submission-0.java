class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1; i<=n; i++) {
            int x = 0;
            int t = i;
            while(t>0) {
                x += (t & 1);
                t >>=1; 
            }
            res[i] = x;
        }
        return res;
    }
}
