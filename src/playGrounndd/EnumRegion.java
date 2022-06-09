package playGrounndd;

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
}
