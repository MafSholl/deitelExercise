package chapterEight;


public interface Player {

//    @Override
//    public boolean equals(Object obj){
//        Player compared = (Player) obj;
//        if (compared.equals(new Player())) return true;
//        return false;
//    }

    void play(int position, Value[][] board);
}
