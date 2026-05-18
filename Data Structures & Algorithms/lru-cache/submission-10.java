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


    private Map<Integer, Node> cache;
    private final int capacity;
    private Node dummyHead;
    private Node dummyTail;
    
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
        Node current = cache.get(key);
        if (current != null) {
            current.value = value;
            remove(current);
            insert(current);
            return;
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if (cache.size() > capacity) {
            cache.remove(dummyHead.next.key);
            remove(dummyHead.next);
        };
    }

    private void insert(Node node) {
        Node prev = dummyTail.prev;
        Node next = dummyTail;
        prev.next = node;
        next.prev = node;
        node.prev = prev;
        node.next = next;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}
