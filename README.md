# Main
1. Run this file to start the program
2. HashTable will generate 10,000 random elements
3. Output will show the size of each bucket
4. Then BST will be tested with example elements
5. Output will show BST keys and values in sorted order
# Classes
1. MyHashTable<K, V>: Implements a hash table using separate chaining. Allows adding, getting, removing elements by key.
2. MyTestingClass: Helper class to generate random keys and manually define hashCode() method.
3. BST<K, V>: Implements a binary search tree. Supports insertion, searching, deletion, and in-order traversal.
4. Main: Tests both MyHashTable and BST classes. Inserts random data into the hash table and fixed data into BST.

# Example Output
====== HashTable Buckets ======
Bucket 0 -> Size: 860
Bucket 1 -> Size: 887
Bucket 2 -> Size: 919
Bucket 3 -> Size: 875
Bucket 4 -> Size: 870
Bucket 5 -> Size: 933
Bucket 6 -> Size: 903
Bucket 7 -> Size: 930
Bucket 8 -> Size: 910
Bucket 9 -> Size: 946
Bucket 10 -> Size: 924
====== BST In-Order Traversal ======
Key is: 2 | Value is: Two
Key is: 3 | Value is: Three
Key is: 4 | Value is: Four
Key is: 5 | Value is: Five
Key is: 7 | Value is: Seven
