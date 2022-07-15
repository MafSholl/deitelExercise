package playGrounndd;

public class GenericPractice <T> {

    private T data;

//    public GenericPractice() {
//
//    }

    public void setterTee(T data){
        this.data = data;
    }

    public T getterTee(){
        System.out.println(data);
        return this.data;
    }

    public static void main(String... args){
        GenericPractice<String> typePractice = new GenericPractice<>();

        typePractice.setterTee("Shola dey code");
        typePractice.getterTee();

        @SuppressWarnings("rawtypes")
        GenericPractice typePractice2 = new GenericPractice<>();
        typePractice2.setterTee(5);
        typePractice2.setterTee("Gotcha!");
    }

}
