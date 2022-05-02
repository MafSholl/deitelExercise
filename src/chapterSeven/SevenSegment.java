package chapterSeven;

public class SevenSegment {
    private int number;
    private String numberStr;
    private int displayNumber;
    private String displayOutputNumbers;
    private boolean isScreen;
    private boolean isArray;
    private int [][] sevenSegment;
    private final int row = 5;
    private final int column = 4;
    private boolean isEmpty;

    public SevenSegment(){
        this.sevenSegment = new int[row][column];
    }

    public void setDisplayNumber(int number){
        this.number = number;
    }

    public void setDisplayNumberToString(){
        this.numberStr = String.valueOf(number);
        System.out.println(numberStr);
    }

    public char getDisplayNumberToString(int position) {
        return numberStr.charAt(position);
    }


    public int getNumber(){
        return number;
    }


    public void setDisplay(){
//        if(String.valueOf(number).contains("5")
        if(numberStr.charAt(7)=='1'){
            isScreen = true;
        }
        else {
            isScreen = false;
        }
    }


    public boolean getScreenDisplay() {
        return isScreen;
    }
//    public void createArray() {
//        int[][] sevenSegment = new int[][];
//    }

    public void arrayChecker(){
        if (sevenSegment.length == 5 ){
            isArray = true;
        }
    }

    public boolean isArray(){
        return isArray;
    }

    public int getArrayLength() {
        return sevenSegment.length;
    }

    public void arrayLoader() {
        int num = 1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                sevenSegment[i][j] = num;
                num++;
            }
        }
    }

    public boolean isEmpty() {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(sevenSegment[i][j] >= 1){
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }

    public int getArrayContent(int row, int column) {
        int element = sevenSegment[row][column];
        return element;
    }

    public void segmentALoader() {
        if(numberStr.charAt(0) == '1') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j < 4; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }
    public void segmentBLoader() {
//        if(numberStr.charAt(1) == '1') {
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j <= 3; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
//        }
    }

    public void segmentCLoader() {
        for(int i = 2; i < 5; i++){
            for(int j = 3; j <= 3; j++){
                sevenSegment[i][j] =  1;
            }
        }
    }
    public void segmentDLoader() {
        for(int i = 4; i <= 4; i++){
            for(int j = 0; j < 4; j++){
                sevenSegment[i][j] =  1;
            }
        }
    }
    public void segmentELoader() {
        for(int i = 2; i < 5; i++){
            for(int j = 0; j < 5; j++){
                sevenSegment[i][j] =  1;
            }
        }
    }
    public void segmentFLoader() {
        for(int i = 0; i <= 0; i++){
            for(int j = 0; j < 3; j++){
                sevenSegment[i][j] =  1;
            }
        }
    }
    public void segmentGLoader() {
        for(int i = 2; i <= 2; i++){
            for(int j = 0; j < 4; j++){
                sevenSegment[i][j] =  1;
            }
        }
    }

}
