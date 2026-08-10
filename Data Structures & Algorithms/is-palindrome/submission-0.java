class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s1.length()-1, i = 0;
        while(i<n) {
            System.out.println("i: "+s1.charAt(i)+", n: "+s1.charAt(n));
            if(s1.charAt(i) != s1.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        System.out.println(s1);
        return true;
    }
}
