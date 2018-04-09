public class LinkedList {

    public Node head;

    public LinkedList(String data) {
        this.head = new Node(data);
    }

    public void insert(String data) {
        if (this.head.next == null) {
            this.head.next = new Node(data);
        } else {
            insert(data, this.head.next);
        }
    }

    private void insert(String data, Node currentNode) {
        if (currentNode.next == null) {
            currentNode.next = new Node(data);
        } else {
            insert(data, currentNode.next);
        }
    }

}
