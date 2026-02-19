package list;

public class LinkedListString {

    private NodeString head;
    private NodeString tail;
    private int size;

    public LinkedListString() {
        head = new NodeString();
        tail = head;
        size = 0;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void add(String item) {
        NodeString newNode = new NodeString(item);
        tail.next = newNode;
        tail = newNode;
        size++;

    }

}
