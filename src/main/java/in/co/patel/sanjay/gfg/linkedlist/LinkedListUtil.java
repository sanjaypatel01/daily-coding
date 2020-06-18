package in.co.patel.sanjay.gfg.linkedlist;

public class LinkedListUtil {
    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public static Node createLinkedList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Node head = new Node(array[0]);
        Node first = head;

        for (int i = 1; i < array.length; i++) {
            Node node = new Node(array[i]);
            first.setNext(node);
            first = node;
        }

        return head;
    }
}
