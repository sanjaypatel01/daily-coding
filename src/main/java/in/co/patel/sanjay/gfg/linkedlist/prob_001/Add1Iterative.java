package in.co.patel.sanjay.gfg.linkedlist.prob_001;

import in.co.patel.sanjay.gfg.linkedlist.LinkedListUtil;
import in.co.patel.sanjay.gfg.linkedlist.Node;

/**
 * Add 1 in a linked list and print the final linked list
 * Iterative solution
 *
 * @Author - Sanjay Kumar
 * @Date - 18th June 2020
 */
public class Add1Iterative {

    public static void main(String[] args) {

        int[] num = new int[]{9, 9, 9};
        Node linkedList = LinkedListUtil.createLinkedList(num);
        System.out.println("Printing provided linked list");
        LinkedListUtil.print(linkedList);

        Node reversedList = reverse(linkedList);
        Node addedList = add1(reversedList);
        reversedList = reverse(addedList);

        System.out.println("Printing final list after adding 1");
        LinkedListUtil.print(reversedList);
    }

    private static Node add1(Node head) {

        if(head == null){
            return new Node(1);
        }

        Node first = head;
        Node temp = head;
        int carry = 1;
        while (head != null){
            int sum = head.getValue() + carry;
            carry = sum /10;
            head.setValue(sum % 10);
            temp = head;
            head = head.getNext();
        }

        if(carry > 0){
            temp.setNext(new Node(carry));
        }

        return first;
    }

    private static Node reverse(Node node) {
        Node previous = null, next, current;
        current = node;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }
}

