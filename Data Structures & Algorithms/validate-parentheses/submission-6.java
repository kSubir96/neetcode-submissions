class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0, n = s.length();
        if(n%2 != 0) return false;
        Map<Character,Character> map = Map.of(')', '(', '}', '{', ']', '[');

        while(i<n) {
            char t = s.charAt(i);
            if(map.values().contains(t))
                st.push(t);
            else {
                if(st.size() == 0) return false;
                if(st.peek() == map.get(t)) {
                    st.pop();
                } else {
                    return false;
                }
            }
            i++;
        }
        return st.size() == 0;
    }
}
