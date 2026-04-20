package oop.labor09;

public class CircularQueue implements IQueue {

    private final int CAPACITY;

    private Object[] items;

    private int front = -1;

    private int rear = -1;



    public CircularQueue(int capacity) {

        this.CAPACITY = capacity;
        this.items = new Object[capacity];

    }


    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }



    public void enQueue(Object obj) {

        if (isFull()) return;

        if (isEmpty()) front = 0;

        rear = (rear + 1) % CAPACITY;

        items[rear] = obj;

    }



    public Object deQueue() {

        if (isEmpty()) return null;

        Object element = items[front];

        if (front == rear) { // Ha ez volt az utolsó elem

            front = -1;

            rear = -1;

        } else {

            front = (front + 1) % CAPACITY;

        }

        return element;

    }



    public void printQueue() {

        if (isEmpty()) return;

        int i = front;

        while (true) {

            System.out.print(items[i] + " ");

            if (i == rear) break;

            i = (i + 1) % CAPACITY;

        }

        System.out.println();

    }



    @Override

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        CircularQueue other = (CircularQueue) obj;
        if (this.CAPACITY != other.CAPACITY)
            return false;
        int i = this.front, j = other.front;
        if (this.isEmpty() && other.isEmpty()) return true;
        if (this.isEmpty() || other.isEmpty()) return false;



        while (true) {

            if (!this.items[i].equals(other.items[j])) return false;

            if (i == this.rear) break;

            i = (i + 1) % CAPACITY;

            j = (j + 1) % CAPACITY;

        }

        return true;

    }

}
