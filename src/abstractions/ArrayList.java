package abstractions;

public class ArrayList implements List{

    private int counter;
    private int length;
    private String[] db;


    private void initializeArray() {
        int length = 5;
        this.length = length;
        this.db = new String[this.length];
    }

    @Override
    public void add(String item) {
        if(this.length == 0){
            initializeArray();
        }

        if (counter < length){
            this.db[counter] = item;
        }
        else if(counter == length){
            createNewArrayWhenFull();
            this.db[counter] = item;
        }
        counter++;
    }

    private void createNewArrayWhenFull() {
        int formerLength = length;
        int newLength = length * 2;
        String [] db = new String[newLength];
        for (int i=0; i < formerLength; i++){
            db[i] = this.db[i];
        }
        length = newLength;
        this.db = db;
    }

    @Override
    public void add(int index, String item) {
        if(this.length == 0){
            initializeArray();
        }
        if (counter < length){
            indexAndStringArraySetter(index, item);
        }
        else if(counter == length){
            createNewArrayWhenFull();
            indexAndStringArraySetter(index, item);
        }
        counter++;
    }

    private void indexAndStringArraySetter(int index, String item) {
        if(this.db[index] == null) {
            this.db[index] = item;
        }
        else {
            int newLength = length + 1;
            String[] db = new String[newLength];
            db[index] = item;
            for (int i = 0; i < length; i++){
                if(db[i] == null) {
                    db[i] = this.db[i];
                }
                else{
                    db[i+1] = this.db[i];
                }
            }this.db = db;
        }
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {

    }

    @Override
    public void remove(int index) {
        for(int i = index; i < counter; i++){
            this.db[i] = this.db[i + 1];
        }
        counter--;
    }

}
