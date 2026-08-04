class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i: stones) {
            pq.offer(i);
        }
        return destroyStones(pq);
    }
    private int destroyStones(PriorityQueue<Integer> pq) {
        while(pq.size()>1) {
            int s1 = pq.poll();
            int s2 = pq.poll();

            if((s1-s2) != 0) {
                pq.offer(Math.abs(s1-s2));
            }
        }
        return pq.size() == 1 ? pq.peek(): 0;
    }
}
