class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int n = t.length;
        int[] res = new int[n];

        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && t[st.peek()]<= t[i]) {
                int x = st.pop();
            }
            if(!st.isEmpty()) {
                res[i] = st.peek()-i;
            } else {
                res[i] = 0;
            }
            st.push(i);
            // System.out.println("st: "+ st);
        }
        return res;
    }
}
