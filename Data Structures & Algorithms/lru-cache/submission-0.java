class LRUCache {
    private final LinkedHashMap<Integer, Integer> q;
    private final int cap;
    private int fKey;
    //= new LinkedList<>();
    public LRUCache(int capacity) {
        q = new LinkedHashMap<>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    // Automatically evict the oldest entry when size exceeds capacity
                    return size() > capacity;
                }};
        cap = capacity;
    }
    
    public int get(int key) {
        return q.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        // if(q.size()<cap) {
            q.put(key, value);
        // } else {
        // }
    }
}
