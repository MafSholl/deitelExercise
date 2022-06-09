package chapterSeven;

public class Position {

    private int column;
    private int row;

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void move(int steps) {
        this.column = steps-1;
    }

    @Override
    public String toString(){
        return "Position {" +
                "row = " + row +
                ", column = " + column +
                "}";
    }

    @Override
    public boolean equals(Object obj){
        Position compared = (Position) obj;
        if(compared.column == this.column && compared.row == this.row ) return true;
        return false;
    }


}
