package playGrounndd;

public class AtmCardValidator {

    private String userCardNumber;
    private boolean isCardValid;
    private long convertedCardNumber;
    private boolean isNumberConverted;
    private int oddNumberSum;
    private int evenNumberSum;

    public void cardNumberInputPrompt(String userCardNumber) {
//        System.out.println("Input your card number");
//        Scanner input = new Scanner(System.in);
//        int userNumber = input.nextInt();
//        BigDecimal userCardNumber = new BigDecimal(userNumber);
        this.userCardNumber = userCardNumber;
    }

    public boolean isCardValid() {
        return isCardValid;
    }

    public void cardValidator() {
        if(userCardNumber.length() >= 13 && userCardNumber.length() <= 15) isCardValid = true;
        else {throw new IllegalArgumentException("Number inputed is not valid");}
    }

    public String getCardNumber() {
        return userCardNumber;
    }


    public long getConvertedCardNumber() {
        return convertedCardNumber;
    }

    public boolean isNumberConverted() {
        if(convertedCardNumber > 0) isNumberConverted = true;
        return isNumberConverted;
    }

    public void oddPositionedNumberSum() {
        int i = 0;
        int oddNumberSum = 0;
        int productDoubleOfNumbers;
        while(i < userCardNumber.length()){
            productDoubleOfNumbers  = Integer.parseInt(String.valueOf(userCardNumber.charAt(i)))*2;
            if(productDoubleOfNumbers <= 9){
                oddNumberSum += productDoubleOfNumbers;
            }else{
                int productCharactersSum = 0;
                for(int j = 0; j < 2; j++){
                    String stringProductDoubleOfNumbers = String.valueOf(productDoubleOfNumbers);
                    productCharactersSum += Integer.parseInt(String.valueOf(stringProductDoubleOfNumbers.charAt(j)));
                }
                oddNumberSum += productCharactersSum;
            }
            i+=2;
        }
        this.oddNumberSum = oddNumberSum;
    }

    public int getOddPositionSum() {
        return oddNumberSum;
    }

    public void evenPositionedNumberSum() {
        int i = 1;
        int evenNumberSum = 0;
        int productDoubleOfNumbers;
        while(i < userCardNumber.length()){
            productDoubleOfNumbers  = Integer.parseInt(String.valueOf(userCardNumber.charAt(i)))*2;
            if(productDoubleOfNumbers <= 9){
            evenNumberSum += productDoubleOfNumbers;
            }else{
                int productCharactersSum = 0;
                for(int j = 0; j < 2; j++){
                    String stringProductDoubleOfNumbers = String.valueOf(productDoubleOfNumbers);
                    productCharactersSum += Integer.parseInt(String.valueOf(stringProductDoubleOfNumbers.charAt(j)));
                }
                evenNumberSum += productCharactersSum;
            }
            i+=2;
        }
        this.evenNumberSum = evenNumberSum;
    }

    public int getEvenPositionSum() {
        return evenNumberSum;
    }
}
