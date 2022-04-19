package tddTests;

public class Stack {

    private int numberOfElements;
    private final int[] elements = new int [5];

    public boolean isEmpty() {
//        return isEmpty;
        if (numberOfElements == 0) return true;
        else return false;
    }

    public void push(int element) {
//        isEmpty = false;
//        this.element = element;
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public int pop() {
//        isEmpty = true;
        numberOfElements--;
        int element = elements[numberOfElements];
        return element;
    }

    public int peep() {
        return elements[numberOfElements - 1];
    }
}
