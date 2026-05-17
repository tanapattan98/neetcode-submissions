class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node dummyHead;
    private final Node dummyTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.dummyHead = new Node(0,0);
        this.dummyTail = new Node(0,0);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    
    public int get(int key) {
        Node current = cache.get(key);
        if (current == null) {
            return -1;
        }
        remove(current);
        insert(current);
        return current.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node current = cache.get(key);
            remove(current);
        }
        cache.put(key, new Node(key, value));
        insert(cache.get(key));

        if (cache.size() > this.capacity) {
            Node lru = dummyHead.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    private void insert(Node node){
        Node prev = dummyTail.prev;
        Node next = dummyTail;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}
