class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Long.compare(sqrt(b), sqrt(a)));
        // int[] o = new int[]{0,0};
        for(int[] p: points) {
            // System.out.println("p: "+p[0]+", : "+p[1]);
            pq.offer(p);
            if(pq.size()> k) {
                pq.poll();
            }
            // System.out.println("pq: "+pq.peek()[0]);
        }
        int[][] res = new int[k][2];
        for(int i =0; i<k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
    private long sqrt(int[] p1) {

        return (p1[0]*p1[0]) + (p1[1]*p1[1]);
    }
}
