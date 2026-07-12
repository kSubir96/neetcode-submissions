class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int n = nums.length;
        int[] res = new int[n];
        int[] pre = new int[n];
        int[] post = new int[n];

        pre[0] = 1;
        for(int i=1; i<n; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        post[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            post[i] = post[i+1] * nums[i+1];
        }
        //pre - 1, 1,2,8
        //post- 48,24,6,1
        // print(pre);
        // System.out.println();
        // print(post);
        for(int i=0; i<n; i++) {
            res[i] = pre[i]*post[i];
        }
        return res;
    }
    // private void print(int[] t) {
    //     for(int i: t) {
    //         System.out.print(i+" ");
    //     }
    // }
}  
