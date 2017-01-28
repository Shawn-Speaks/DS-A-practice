package nyc.c4q.shawn.NodeStuff;

/**
 * Created by shawnspeaks on 1/27/17.
 */
public class LinkedList {

    Node head;

    public static void main(String[] args) {
       Node lastNode = new Node("Z-node", null);
       Node secondToLastNode = new Node("Y-node", lastNode);
       Node nToLastNode = new Node("X-node", secondToLastNode);
       Node nMinusOneToLastNode = new Node("W-node", nToLastNode);
       Node nMinus_n_node = new Node("A-node", nMinusOneToLastNode);


        LinkedList myLinkedList = new LinkedList();
        int linkedListLength = myLinkedList.getLength(nMinus_n_node);
        myLinkedList.searchLinkedList(nMinus_n_node, "A-node");
        System.out.println(linkedListLength);
    }

    private int getLength(Node currentNode){
        int length = 0;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }


    private boolean searchLinkedList(Node head, Object target){
        int position = 0;
        while(head.next != null){

            if(head.value.equals(target)){
                System.out.println("Node found at position #" + position);
                return true;
            }
            position++;
            head = head.next;
        }
        System.out.println("Node not found");
        return false;
    }



}
