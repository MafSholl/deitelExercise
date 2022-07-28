package dataStructures;

public class LinkedList {


    private class Node {
        private Object data;
        private Node previous;
        private Node next;

        public Node(){
        }
        public Node(Object data){
            this.data = data;
        }
    }


    private Node first;
    private Node last;
    private int count;


    public void addFirst(Object value){
        Node node = new Node(value);
        if(first == null) {
            first = node;
        }else {
            Node formerFirstNode = first;
            first = node;
            first.next  = formerFirstNode;
            formerFirstNode.previous = first;
        }
        count++;
    }

    public void addLast(Object value) {
        Node node = new Node(value);
        Node previousNode;
        if(first == null){
            first =  node;
            first.previous = null;
        }else{
            Node addedNode = first;
            while(addedNode.next != null){
                previousNode = addedNode;
                addedNode = addedNode.next;
                addedNode.previous = previousNode;
            }
            addedNode.next = node;
            last = addedNode.next;
            last.previous = addedNode;
        }
        count++;
    }

    public void remove(int index) {
        Node node = first;
        for(int i = 1; i <= index; i++){
            node = node.next;
            if (i == index) {
                node.data = node.next.data;
                node.next = null;
            }
        }
        count--;
    }

    public void clear(){
        Node stillNode = last;
        while(stillNode.previous != null){
            stillNode = stillNode.previous;;
            stillNode.next = null;
            count--;
        }
        first = null;
        last = null;
        count--;
//        count--;
//        for(int i = 0; i < count; i++){
//            stillNode = stillNode.next;
//            stillNode.previous = null;
//            count++;
//        }
    }


    public int size() {
        return count;
    }

    public Object get(int index) {
        if(index >= 1) {
            Node node = first;
//            for(int i = 0; i < index; i++){
//                node = node.next;
//            }
            for(int i = 1; i <= index; i++){
                node = node.next;
            }
            return node.data;
        }
        return first.data;
    }

    public Object getPreviousNodeValueAtNode(int index) {
        if(index >= 1) {
            Node node = first;
            for (int i = 1; i <= index; i++) {
                node = node.next;
            }
            return node.previous.data;
        }
        return first.previous;
    }

    public Object getFirst() {
        return first.data;
    }

    public Object getLast() {
        return last.data;
    }

    public Object element() {
        return first.data;
    }




}
