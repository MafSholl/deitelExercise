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
        boolean isContain;
        for(int i = 0; i < collection.length; i++){
            isContain = false;
            for(int j = 0; j < arrayList.size(); j++){
                if(collection[i] == arrayList.get(j)){
                    isContain = true;
                    break;
                }
            }
            if(!isContain) {
                arrayList.add(collection[i]);
                count++;
            }
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
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public boolean removeAll(Object[] collection) {
        boolean collectionItemChecker = false;
        //collectionItemChecker checks if everything in the collection actually
        // exist in the set before it embarks to delete any of the set content at all
        for (int i = 0; i < collection.length; i++) {
            collectionItemChecker = false;
            for (int j = 0; j < arrayList.size(); j++) {
                if (collection[i] == arrayList.get(j)) {
                    collectionItemChecker = true;
                    break;
                }
            }
            if (!collectionItemChecker) break;
        }
        if (collectionItemChecker){
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
