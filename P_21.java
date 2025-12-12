
public class P_21 {

    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1 == front);
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
        
        }rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println(value + " enqueued");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int value = queue[front];
        if (front == rear) { 
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            
            }i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P_21 q = new P_21();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}