package linkedList;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;

    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }

    // add - first , last

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    // print
    public void printList(String data) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }
    // delete first

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This is empty List");
            return;

        }
        head = head.next;
        size--;

    }

    // delete last

    public void deleteLast() {
        if (head == null) {
            System.out.println("This is empty List");
            return;

        }
        if (head.next == null) {
            head = null;
            return;
        }
        size--;

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.printList(null);
        list.addLast("list");
        list.printList(null);
        list.addFirst("this");
        list.addFirst("Amir");
        list.printList(null);
        list.deleteFirst();
        list.printList(null);
        list.deleteLast();
        list.printList(null);
        System.out.println(list.getSize());

    }

}
