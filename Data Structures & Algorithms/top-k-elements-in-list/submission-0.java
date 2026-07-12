class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        //{1=1, 2=2, 3=3}
        PriorityQueue<Map.Entry<Integer,Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer,Integer> ent : map.entrySet()) {
            pq.offer(ent);
            if(pq.size()>k) pq.poll();
        }
        int i = 0;
        while(!pq.isEmpty()) {
            res[i] = pq.poll().getKey();
            i++;
        }
        return res;
    }
}
