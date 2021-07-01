package JavaCollectionFramework.Queue.CircularQueue;

import static JavaCollectionFramework.Queue.CircularQueue.CircularQueue.*;

public class CircularQueueClient {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q, 12);
        enQueue(q, 1);
        enQueue(q, 32);
        enQueue(q, 9);
        enQueue(q, 57);

        display(q);

        System.out.printf("\nDeleted value: %d\n", deQueue(q));

        display(q);

        System.out.printf("\nDeleted value: %d\n", deQueue(q));

        display(q);


        System.out.print("\nAdd 7, 27");
        enQueue(q, 7);
        enQueue(q, 27);

        System.out.println("");
        display(q);
    }


}
