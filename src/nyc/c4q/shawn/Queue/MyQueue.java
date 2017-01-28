package nyc.c4q.shawn.Queue;

/**
 * Created by shawnspeaks on 1/27/17.
 */
public class MyQueue {

    public static void main(String[] args) {
        //Queue Node with 10items
        QueueNode allMightyHead = new QueueNode(0);
        MyQueue Q = new MyQueue();
        Q.createNodeQueue(10, allMightyHead);
        System.out.println(Q.getLength(allMightyHead));
        allMightyHead = Q.dequeue(allMightyHead);
        System.out.println(allMightyHead);


        QueueNode current = allMightyHead;
        System.out.println("~~~~~~~~~~");
        while(current != null){
            System.out.println(current);
            current = current.next;
        }


    }

    private QueueNode createNodeQueue(int queueLength, QueueNode head){
        QueueNode current = head;
        for(int i = 1; i < queueLength; i++){
           current.next = new QueueNode((i+1)*7);
           current = current.next;
        }
        return head;
    }

    private int getLength(QueueNode currentNode){
        int length = 0;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    private QueueNode dequeue(QueueNode head){

        int headValue = head.data;
        System.out.println("Value of data at head position is " + headValue);


        head = head.next;
        System.out.println("New head value is equal to " + head.data);

        return head;
    }

}
