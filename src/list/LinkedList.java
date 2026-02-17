
package list;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
        public Node() {
            this(null, null);
        }
        public Node(T data) {
            this(data, null);
        }
        @Override
        public String toString() {
            if (data == null) {
                return "null";
            } else {
                return data.toString();
            }
        }
    }

    private int size;
    
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.size = 0;
        head = new Node<T>(); // dummy head node
        tail = head;
    }

    @Override 
    public int size() {
        return this.size;
    }

    @Override 
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void add(T element) {
        // step 1
        Node<T> newNode = new Node<T>(element);

        // step 2
        tail.next = newNode;

        // step 3
        tail = newNode;

        // step 4
        size++;
        
    }

    @Override
    public String toString() {
        String s = "[";
        Node<T> cur = head.next;

        while (cur != null) {
            s += cur.data.toString();
            if (cur.next != null) {
                s += ", ";
            }
            cur = cur.next;
        }

        s += "] ";
        s += "size = " + size;
        s += ", head: " + head.toString();
        s += ", tail: " + tail.toString();
        return s;
    }

    @Override
    public T get(int index) {

        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        Node<T> cur = head;
        for (int i = 0; i <= index; i++) {
            if (cur.next != null) {
                cur = cur.next;
            }
        }
        return cur.data;
    }

}
