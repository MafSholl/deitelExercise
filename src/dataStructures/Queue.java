package dataStructures;

public class Queue {

    private Object[] queue = new Object[5];
    private int counter;

    public void queue(Object element) {
        if(counter == 0){
            queue[counter] = element;
        }else if(counter > 0 && counter < queue.length){
            if(queue[0].getClass() == element.getClass()){
            queue[counter] = element;
            } else{
                throw new ClassCastException("Incompatible object types");
            }
        }else{
            throw new StackOverflowError("Queue length exceeded");
        }
        counter++;
    }

    public int size() {
        return counter;
    }

    public Object get(int index) {
        return queue[index];
    }

    public Object peek() {
        return queue[0];
    }

    public Object dequeue() {
        Object poppedElement = queue[0];
        for(int i = 0; i < queue.length-1; i++){
            queue[i] = queue[i+1];
        }
        counter--;
        return poppedElement;
    }
}
