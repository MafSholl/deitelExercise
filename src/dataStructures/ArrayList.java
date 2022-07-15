package dataStructures;

public class ArrayList {

    private boolean isEmpty = true;
    private int length;
    private int count;
    private Object [] container;
    private boolean isContain;


    public ArrayList(){

    }

    public boolean isEmpty (){
        return isEmpty;
    }

    public Object get(int index) {
        if(length == 0) throw new NullPointerException("Item does not exist in the index entered");
        return container[index];
    }

    public Object get(Object element){
        Object returnee = null;
        if (length == 0) throw new NullPointerException("Item does not exist in the index entered");
        for (int i = 0; i < count; i++){
            if(container[i] == element) {
                returnee = container[i];
                break;
            }
        }
        return returnee;
    }

    public void add(Object item) {
        if (count == 0){
            length = 5;
            container = new Object[length];
            container[count] = item;
            isEmpty = false;
            count++;
        } else if(count > 0 && count < length) {
            if (item.getClass().equals(container[0].getClass())) {
                container[count] = item;
                count++;

            } else {
                throw new ClassCastException("Inconsistent object type!");
            }
        }else {
            expandArray(count, item);
        }
    }

public void add (int index, Object item){
        if(count == 0){
            length = 5;
            container = new Object[length];
            container[index] = item;
            isEmpty = false;
            count++;
        }else if(count < length) {
            if (item.getClass() == container[0].getClass()) {
                if(container[index] == null){
                    container[index] = item;
                    count++;
                } else {
                    for(int i = count; i > index; i--){
                        container[i + 1] = container[i];
                    }
                    container[index] = item;
                    count++;
                }
            }else {
                throw new ClassCastException("Inconsistent object type!");
            }
        }else if(count == length){
//            expandArray(index, item);
            int newLength = length * 2;
            createTemp_ExpandGlobal_CopyBackIntoArray(newLength, length);
            if (item.getClass() == container[0].getClass()) {
                if(container[index] == null){
                    container[index] = item;
                    count++;
                } else {
                    for(int i = count; i > index; i--){
                        container[i + 1] = container[i];
                    }
                    container[index] = item;
                    count++;
                }
            }else {
                throw new ClassCastException("Inconsistent object type!");
            }
            length = newLength;
            count++;
        }
    }

    private void expandArray(int index, Object item) {
        int newLength = length * 2;
        createTemp_ExpandGlobal_CopyBackIntoArray(newLength, length);
        if (item.getClass() == container[0].getClass()) {
            if(container[index] == null){
                container[index] = item;
                count++;
            } else {
                for(int i = count; i > index; i--){
                    container[i + 1] = container[i];
                }
                container[index] = item;
                count++;
            }
        }else {
            throw new ClassCastException("Inconsistent object type!");
        }
        length = newLength;
    }

    private void createTemp_ExpandGlobal_CopyBackIntoArray(int newLength, int length) {
        Object[] tempArray = new Object[length];
        for(int i = 0; i < length; i++){
            tempArray[i] = container[i];
        }
        container = new Object[newLength];
        for(int i = 0; i < length; i++){
            container[i] = tempArray[i];
        }
    }

    public int size() {
        return count;
    }

    public void remove(int index) {
        int newLength = length - 1;
        if(newLength > 0) {
            for (int i = index; i < newLength; i++) {
                container[i] = container[i + 1];
            }
            createTemp_ExpandGlobal_CopyBackIntoArray(newLength, newLength);
            length = newLength;
            count--;
        }
    }

    public boolean contains(Object element){
        for(int i = 0; i < length; i++){
            if(element.equals(container[i])) {
                this.isContain = true;
                break;
            } else {
                this.isContain = false;
            }
        }
        return this.isContain;
    }

}
