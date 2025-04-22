import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Тестирование MyHashTable
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000000));
            table.put(key, "Value" + i);
        }

        System.out.println("====== HashTable Buckets ======");
        for (int i = 0; i < 11; i++) {
            System.out.println("Bucket " + i + " -> Size: " + table.getBucketSize(i));
        }

        System.out.println("\n====== BST In-Order Traversal ======");
        // Тестирование BST
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "Five");
        tree.put(3, "Three");
        tree.put(7, "Seven");
        tree.put(2, "Two");
        tree.put(4, "Four");

        for (var node : tree.iterator()) {
            System.out.println("Key is: " + node.getKey() + " | Value is: " + node.getValue());
        }
    }
}