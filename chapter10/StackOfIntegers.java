package chapter10;

public class StackOfIntegers {
    
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    
    public void push(int newElement) {
        if(size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = newElement;
    }
    
    public int pop() {
        return elements[--size];
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

}
