class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap<>();

        for(char t : tasks) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        System.out.println(map);
        int res = 0;

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
                                    Comparator.comparing(Map.Entry<Character,Integer>::getValue).reversed());
        
        for(Map.Entry<Character,Integer> mE: map.entrySet()) {
            pq.offer(mE);
        }
        System.out.println(pq);
        // (maxfreq-1)*(n+1) -> putting max freq element at start and space reqd is ngaps+ element
        Map.Entry<Character,Integer> peek = pq.peek();
        int mf = peek.getValue();
        int mc = 0;
        while(!pq.isEmpty()) {
            Map.Entry<Character,Integer> t = pq.poll();
            if(peek.getValue().equals(t.getValue())) {
                mc++;
            } else {
                break;
            }
            // System.out.println("char : "+t+", mc: "+mc);
            // mf = Math.max(mc, mf);
        }
        System.out.println("mf: "+mf);
        return Math.max(tasks.length, ((mf-1)*(n+1))+ mc);
    }
}
