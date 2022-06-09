package chapterSeven;

public class SevenSegment {
    private String number = "11111111";
    private boolean isScreen;
    private boolean isArray;
    private final int [][] sevenSegment;
    private final int row = 5;
    private final int column = 4;
    private boolean isEmpty;

    public SevenSegment(){
        this.sevenSegment = new int[row][column];
    }

    public void setDisplayNumber(String number){
        this.number = number;
    }

    public char getNumberAtAPosition(int position) {
        return number.charAt(position);
    }


    public String getNumber(){
        return number;
    }


    public void isScreen(){
//        if(String.valueOf(number).contains("5")
        if(number.charAt(7)=='1'){
            isScreen = true;
        }
        else {
            isScreen = false;
        }
    }


    public boolean getScreenDisplay() {
        return isScreen;
    }

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
        setDisplayNumber(number);
        if(number.charAt(7) == '1') {
            segmentALoader();
            segmentBLoader();
            segmentCLoader();
            segmentDLoader();
            segmentELoader();
            segmentFLoader();
            segmentGLoader();
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
        if(number.charAt(0) == '1') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j < 4; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    public void segmentBLoader() {
        if(number.charAt(1) == '1') {
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j <= 3; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    public void segmentCLoader() {
        if(number.charAt(2) == '1') {
            for (int i = 2; i < 5; i++) {
                for (int j = 3; j <= 3; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    public void segmentDLoader() {
        if(number.charAt(3) =='1') {
            for (int i = 4; i <= 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    public void segmentELoader() {
        if(number.charAt(4) == '1') {
            for (int i = 2; i < 5; i++) {
                for (int j = 0; j <= 0; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }
    public void segmentFLoader() {
        if(number.charAt(5) == '1') {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <= 0; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    public void segmentGLoader() {
        if(number.charAt(6) == '1') {
            for (int i = 2; i <= 2; i++) {
                for (int j = 0; j < 4; j++) {
                    sevenSegment[i][j] = 1;
                }
            }
        }
    }

    private void rowOneDisplay() {
        for(int i = 0; i <= 0; i++){
            for(int j = 0; j < 4; j++){
                if (sevenSegment[i][j]== 1){System.out.print("#" + "   ");}
                else{System.out.print(" " + "   ");}
            }
            System.out.println();
        }
    }

    private void rowTwoDisplay() {
        for(int i = 1; i <= 1; i++){
            for(int j = 0; j < 4; j++){
                if (sevenSegment[i][j]== 1){System.out.print("#" + "   ");}
                else{System.out.print(" " + "   ");}
            }
            System.out.println();
        }
    }

    private void rowThreeDisplay() {
        for(int i = 2; i <= 2; i++){
            for(int j = 0; j < 4; j++){
                if (sevenSegment[i][j]== 1){System.out.print("#" + "   ");}
                else{System.out.print(" " + "   ");}
            }
            System.out.println();
        }
    }

    private void rowFourDisplay() {
        for(int i = 3; i <= 3; i++){
            for(int j = 0; j < 4; j++){
                if (sevenSegment[i][j]== 1){System.out.print("#" + "   ");}
                else{System.out.print(" " + "   ");}
            }
            System.out.println();
        }
    }

    private void rowFiveDisplay() {
        for(int i = 4; i <= 4; i++){
            for(int j = 0; j < 4; j++){
                if (sevenSegment[i][j]== 1){System.out.print("#" + "   ");}
                else {System.out.print(" " + "   ");}
            }
            System.out.println();
        }
    }

    public void arrayDisplay() {
        rowOneDisplay();
        rowTwoDisplay();
        rowThreeDisplay();
        rowFourDisplay();
        rowFiveDisplay();
    }
}
