package HomeWork_Modul9_5;


public class MyHashMap <Integer, String> {
            private static final int DEFAULT_CAPACITY = 16;
            private Node[] buckets;

            public MyHashMap() {
                buckets = new Node[DEFAULT_CAPACITY];
            }

            public void put(Object key, Object value) {
                int hashCode = key.hashCode();
                int index = hashCode % buckets.length;

                Node newNode = new Node(key, value);

                if (buckets[index] == null) {
                    buckets[index] = newNode;
                } else {
                    Node current = buckets[index];
                    while (current != null) {
                        if (current.key.equals(key)) {
                            current.value = value;
                            return;
                        }
                        current = current.next;
                    }
                    newNode.next = buckets[index];
                    buckets[index] = newNode;
                }
            } //put(Object key, Object value) додає пару ключ + значення

            public void remove(Object key) {
                int hashCode = key.hashCode();
                int index = hashCode % buckets.length;

                Node current = buckets[index];
                Node previous = null;

                while (current != null) {
                    if (current.key.equals(key)) {
                        if (previous == null) {
                              buckets[index] = current.next;
                        } else {
                              previous.next = current.next;
                        }
                        return;
                    }
                    previous = current;
                    current = current.next;
                }
            } //remove(Object key) видаляє пару за ключем

                public Object get(Object key) {
                    int hashCode = key.hashCode();
                    int index = hashCode % buckets.length;

                    Node current = buckets[index];

                    while (current != null) {
                        if (current.key.equals(key)) {
                            return current.value;
                        }
                        current = current.next;
                    }

                    return null;
                } //        get(Object key) повертає значення (Object value) за ключем
            public int size() {
                int count = 0;
                for (int i = 0; i < buckets.length; i++) {
                    Node current = buckets[i];
                    while (current != null) {
                        count++;
                        current = current.next;
                    }
                }
                return count;
            }  //        size() повертає розмір колекції
           public void clear() {
               for (int i = 0; i < buckets.length; i++) {
                   buckets[i] = null;
               }
           } //        clear() очищає колекцію

            private static class Node {
                Object key;
                Object value;
                Node next;

                Node(Object key, Object value) {
                    this.key = key;
                    this.value = value;
                }
            }
        }







