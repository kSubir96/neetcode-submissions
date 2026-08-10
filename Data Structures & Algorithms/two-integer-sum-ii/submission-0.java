class Solution {
    public int[] twoSum(int[] x, int target) {
        int n = x.length-1, i = 0;
        int sum  = 0;
        int []res = new int[2];
        while(i<n) {
            sum = x[i] + x[n];
            if(target== sum) {
                res[0] = i+1;
                res[1] = n+1;
                break;
            } else if (sum > target) {
                n--;
            } else {
                i++;
            }
        }
        return res;
    }
}
