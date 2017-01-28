package nyc.c4q.shawn.NodeStuff;

/**
 * Created by shawnspeaks on 1/27/17.
 */
public class Node {

    Node next;
    String value;


    public Node(String value, Node next) {
        this.next = next;
        this.value = value;
    }
}
