package dataStructures;

public class Set {

    private boolean isEmpty = true;
    private int length;
    private int count;
    private ArrayList arrayList = new ArrayList();


    public Set(){
//        ArrayList[] arrayList = new ArrayList[10];
//        this.arrayList = arrayList;
    }

    public void add(Object item){
        arrayList.add(item);
        isEmpty = false;
        count++;
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
        }
        return isContain;
    }
}
