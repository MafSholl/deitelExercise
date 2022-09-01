package playGrounndd;

import java.util.Arrays;

public enum EnumRegion {
    SE("Agege", "ipaja"),
    SS("Ogun", "Lekki"),
    SW,
    NE,
    NW,
    NC;

    private String[] states;

    EnumRegion(String... states){
        this.states = states;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(EnumRegion.SE.states));
    }
}
