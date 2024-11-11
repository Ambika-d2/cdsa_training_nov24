class DoublyLinkedList {
    // Node class represents each node in the doubly linked list
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Display the list from the beginning
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the list from the end
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Delete a node by its value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        // If the node to be deleted is the head node
        if (current.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Traverse to find the node to be deleted
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + data + " not found.");
            return;
        }

        // Update the pointers to remove the node
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Doubly linked list (forward):");
        list.displayForward();

        System.out.println("\nDoubly linked list (backward):");
        list.displayBackward();

        System.out.println("\nDeleting node with value 20:");
        list.delete(20);
        list.displayForward();

        System.out.println("\nDeleting node with value 50 (not in the list):");
        list.delete(50);
        list.displayForward();
    }
}
