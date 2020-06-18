package in.co.patel.sanjay.gfg.linkedlist.prob_001;

import in.co.patel.sanjay.gfg.linkedlist.LinkedListUtil;
import in.co.patel.sanjay.gfg.linkedlist.Node;

/**
 * Add 1 in a linked list and print the final linked list
 * Recursive solution
 *
 * @Author - Sanjay Kumar
 * @Date - 18th June 2020
 */
public class Add1Recursive {

    public static void main(String[] args) {

        int[] num = new int[]{1, 2, 9};
        Node linkedList = LinkedListUtil.createLinkedList(num);
        System.out.println("Printing provided linked list");
        LinkedListUtil.print(linkedList);

        Node reversedList = add1Recursive(linkedList);
        System.out.println("Printing reversed list before adding 1");
        LinkedListUtil.print(reversedList);
    }

    private static Node add1Recursive(Node head) {
        int carry = addWithCarry(head);

        // In case carry is 1, need to add new node and return the same node.
        if (carry > 0) {
            Node newHead = new Node(carry);
            newHead.setNext(head);
            return newHead;
        }
        // Return original node
        return head;
    }

    private static int addWithCarry(Node node) {
        if (node == null) {
            return 1;
        }

        int res = node.getValue() + addWithCarry(node.getNext());
        node.setValue(res % 10);
        return res / 10;
    }
}