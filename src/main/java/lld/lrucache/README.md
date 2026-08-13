# LRU Cache

## Problem
Design and implement an LRU (Least Recently Used) cache with O(1) get/put.

## Clarifying questions
- Fixed capacity set at construction — what happens on overflow (evict LRU)?
- Thread-safety required?
- Does `get` count as "use" (it should, for LRU)?

## Core entities
- `Node` — doubly linked list node holding key/value
- `LRUCache` — HashMap<key, Node> + doubly linked list for O(1) ordering updates

## Things interviewers probe for
- Actually getting O(1) for both get and put (HashMap + doubly linked list,
  not just a LinkedHashMap unless they're fine with you naming that shortcut).
- Correct handling of eviction when at capacity.
- Edge cases: updating an existing key, capacity of 0/1.
