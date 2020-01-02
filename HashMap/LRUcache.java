class LRUCache {
    private int cap;
    private Map<Integer, Integer> map = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;    
    }
    
    public int get(int key) {
        if(map.keySet().contains(key)){
            int value = map.get(key);
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.keySet().contains(key)){
            map.remove(key);
        }else if(map.size() == cap){
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
