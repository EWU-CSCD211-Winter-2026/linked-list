package list;

public class NodeString {

    public String data;
    public NodeString next;

    public NodeString(String data, NodeString next) {
        this.data = data;
        this.next = next;
    }
    public NodeString() {
        this(null, null);
    }
    public NodeString(String data) {
        this(data, null);
    }

}
