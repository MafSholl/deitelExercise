package dataStructures;

public class LinkedList {


    private class Node {
        private Object value;
        private Node previous;
        private Node next;

        public Node(){
        }
        public Node(Object value){
            this.value =  value;
        }
    }


    private Node first;
    private Node last;
    private int count;

    public void add(Object value) {
        Node node = new Node(value);
        if(first == null){
            first =  node;
        }else{
            Node addedNode = first;
            Node previousNode;
            while(addedNode.next != null){
                previousNode = addedNode;
                addedNode = addedNode.next;
                addedNode.previous = previousNode;
            }
            addedNode.next = node;
            last = addedNode;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public Object get(int index) {
        Node node;
        if(index >= 1) {
            node = first;
//            for(int i = 0; i < index; i++){
//                node = node.next;
//            }
            for(int i = 1; i <= index; i++){
                node = node.next;
            }
            return node.value;
        }
        return first.value;
    }

    public Object getPreviousNodeValueAtNode(int index) {
        if(index >= 1) {
            Node node = first;
            for (int i = 1; i <= index; i++) {
                node = node.next;
            }
            return node.previous.value;
        }
        return first.previous;
    }




}
