package in.co.patel.sanjay.gfg.linkedlist.prob_002;

import in.co.patel.sanjay.gfg.linkedlist.LinkedListUtil;
import in.co.patel.sanjay.gfg.linkedlist.Node;

/**
 * Delete N nodes after each M Nodes in a linked list
 *
 * @Author: Sanjay Kumar
 * @Date: 18th June 2020
 */
public class DeleteNAfterMNodes {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        int m = 2;
        Node head = LinkedListUtil.createLinkedList(array);

        // Delete n nodes after m nodes.
        deleteNNodesAfterMNodes(head, n, m);

        //Print linked list after deleting nodes
        LinkedListUtil.print(head);
    }

    private static void deleteNNodesAfterMNodes(Node head, int n, int m) {

        // main loop traversal
        while (head != null) {

            //Skip m nodes
            for (int counter = 1; counter < m && head != null; counter++) {
                head = head.getNext();
            }

            // Return if it reached till the end of the list
            if (head == null) {
                return;
            }

            // Start from node and delete n nodes
            Node temp = head.getNext();
            for (int counter = 1; counter <= n && temp != null; counter++) {
                temp = temp.getNext();
            }

            //Link the previous list with with the remaining list
            head.setNext(temp);

            head = temp;
        }
    }
}
