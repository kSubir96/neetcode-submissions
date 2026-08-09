class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {
            int cr = (a & b);
            a = (a ^ b);
            b = cr <<1;
        }
        return a;
    }
}
