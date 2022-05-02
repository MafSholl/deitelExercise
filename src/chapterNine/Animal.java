package chapterNine;

public class Animal extends LivingThings{

//    public Animal(int something){
////        this();
//    }
    public Animal(){
//        super();
        System.out.println("Creating a new animal in animal");
    }

//    @Override
//    public void move() {
//        System.out.println("Moving like an animal");
//    }

    public void thisIsYourFathersMove(){
        super.move();
    }
}
