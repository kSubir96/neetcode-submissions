class Solution {
    public int reverseBits(int n) {
        String str = "";

        for (int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                str = str + "1";
            } else {
                str = str + "0";
            }
            n = n>>1;
        }
        
        return (int) Long.parseLong(str, 2);

    }
}
