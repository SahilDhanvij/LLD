package lld.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<K, Node<K, V>> map;
    // TODO: dummy head/tail sentinel nodes for the doubly linked list

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        // TODO: initialize sentinel head/tail and link them to each other
    }

    public V get(K key) {
        // TODO: if present, move node to "most recently used" end, return value
        // else return null
        throw new UnsupportedOperationException("not implemented");
    }

    public void put(K key, V value) {
        // TODO: if key exists, update value + move to MRU end.
        // else insert new node at MRU end; if over capacity, evict LRU end.
        throw new UnsupportedOperationException("not implemented");
    }
}
