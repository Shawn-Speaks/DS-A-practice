package nyc.c4q.shawn.Queue;

/**
 * Created by shawnspeaks on 1/27/17.
 */
public class QueueNode {

    QueueNode next = null;
    int data;

    public QueueNode(int data) {
        this.data = data;
    }

    public QueueNode(QueueNode next, int data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
