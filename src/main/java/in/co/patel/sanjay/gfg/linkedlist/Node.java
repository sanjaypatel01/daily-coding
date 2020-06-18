package in.co.patel.sanjay.gfg.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
}