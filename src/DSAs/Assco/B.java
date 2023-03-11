package DSAs.Assco;

public class B extends A{

    protected void doSmth() {
        System.out.println("Do smth B");
    }
    protected void doSmthElse(int i){
        System.out.println("Do smth else B");
    }


    public static void main(String[] args) {
        A ref = new B();
        ref.doSmth();
        ref.doSmthElse();
    }
}
