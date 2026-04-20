package oop.labor09;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue {
    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int capacity) {
        this.CAPACITY = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if (!isFull()) {
            items.add(obj);
        } else {
            System.out.println("A sor megtelt!");
        }
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            return null;
        }

        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items.toString());
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ArrayListQueue other = (ArrayListQueue) obj;



        return Objects.equals(this.items, other.items);
    }
}