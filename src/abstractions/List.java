package abstractions;

public interface List {

    void add(String item);
    void add(int index, String item);
    int size();
    String get(int index);
    void remove(String item);
    void remove(int index);

}
