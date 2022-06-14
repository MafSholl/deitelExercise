package dataStructures;

public class Set {

    private boolean isEmpty = true;
    private int count;
    private ArrayList arrayList = new ArrayList();


    public Set(){

    }

    public boolean add(Object item){
        if(count == 0) {
            arrayList.add(item);
            isEmpty = false;
            count++;
            return true;
        } else if (count > 0) {
            if (!arrayList.contains(item)) {
                arrayList.add(item);
                count++;
                return true;
            }
        }
        return false;
    }

    public void addAll(Object[] collection){
        for(int i = 0; i < collection.length; i++){
            arrayList.add(collection[i]);
            count++;
        }
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public int size() {
        return arrayList.size();
//        return count;
    }

    public Object get(int index) {
        return arrayList.get(index);
    }

    public void clear() {
        for(int i = 0; i < count; i++){
            arrayList.remove(i);
        }
        count = 0;
    }

    public boolean contains(Object element){
        return arrayList.contains(element);
    }

    public boolean containsAll(Object[] collections){
        boolean isContain = false;
        for(int i = 0; i < collections.length; i++){
            isContain = arrayList.contains(collections[i]);
            if(!isContain) break;
        }
        return isContain;
    }

    public boolean remove(Object o) {
        if(arrayList.get(o) == o) {
            for (int i = 0; i < arrayList.size(); i++){
                if (arrayList.get(i) == o) {
                    arrayList.remove(i);
                }
            }
            return true;
        }
        return false;
    }

    public boolean removeAll(Object[] collection) {
        boolean returnee = false;
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                returnee = false;
                if (collection[i] == arrayList.get(j)) {
                    returnee = true;
                    break;
                }
            }
            if (!returnee) break;
        }
        if (returnee){
            for(int i = 0; i < collection.length; i++){
                for (int j = 0; j < arrayList.size(); j++){
                    if (collection[i] == arrayList.get(j)) {
                        arrayList.remove(j);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
