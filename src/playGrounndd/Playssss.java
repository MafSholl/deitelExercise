package playGrounndd;


import java.util.ArrayList;
import java.util.List;

public class Playssss {

    public static List brainstorm() {
        ArrayList<Integer> something = new ArrayList();
        for (int i=0;i<30; i++) something.add(i);

        System.out.println(something.size());
        return List.of(something.toArray());
    }

    public static void main(String[] args) {
        System.out.println(brainstorm());

    }
}
