package dataStructures;


public class Stack {

    private Object[] stack = new Object[5];
    private int counter;
    public void push(Object element) {
        if(counter == 0) {
            stack[counter] = element;
        } else if (counter < stack.length){
            if (element.getClass() == stack[0].getClass()) {
                stack[counter] = element;
            }else{
                throw new ClassCastException("Incompatible object types");
            }
        } else{
            throw new StackOverflowError("Stack overflow errow");
        }
        counter++;
    }

    public int size() {
        return counter;
    }

    public void remove() {
        counter--;
    }

    public Object get(int index) {
        return stack[index];
    }

    public boolean isEmpty() {
        if(counter > 0) {return false;}
        return true;
    }

    public Object pop() {
        counter--;
        return stack[counter];
    }

    public Object peek() {
        return stack[counter-1];
    }
}
