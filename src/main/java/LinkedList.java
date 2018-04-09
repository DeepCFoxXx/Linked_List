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

    public Node find(String data) {
        if (this.head.data == data) {
            return this.head;
        } else {
            return find(data, this.head.next);
        }
    }

    private Node find(String data, Node currentNode) {
        if (currentNode.data == data) {
            return currentNode;
        } else if (currentNode.next != null){
            return find(data, currentNode.next);
        } else {
            return null;
        }
    }

    public Boolean update(String toUpdate, String newData) {
        Node node = find(toUpdate);
        if (node != null) {
            node.data = newData;
            return true;
        } else {
            return false;
        }
    }

    public Node findParent(String data) {
        if (this.head.data == data) {
            return null;
        } else {
            return findParent(data, this.head);
        }
    }

    private Node findParent(String data, Node currentNode) {
        if (currentNode.next.data == data) {
            return currentNode;
        } else {
            return findParent(data, currentNode.next);
        }
    }

}
