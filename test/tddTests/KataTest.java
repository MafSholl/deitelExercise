package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KataTest{
    @Test
    public void palindromeTest() {
        Kata newKata = new Kata();
        boolean result = newKata.palindrome(12121);
        assertEquals(true, result);
    }
    @Test
    public void utmeVendorTest(){
        Kata vendor = new Kata();
        vendor.utmeVendor(5);
        assertEquals(9000, vendor.utmeVendor(5));
    }

    @Test
    public void quotientTest(){
        Kata newKata = new Kata();
        int result = newKata.quotientOfTwoNumbers(22,2);
        assertEquals(11, result);
    }
    @Test
    public void numbersFromOneToTen(){
        int number = 1;
        while (number <= 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
    }
    @Test
    public void evenOrOddNumbersTest(){
        Kata katakata = new Kata();
        boolean result = katakata.evenOrOddNumber(22);
        assertTrue(result);
    }
    @Test
    public void biggestOfFiveNumbersTest(){
        Kata katakata = new Kata();
        int result = katakata.biggestOfFiveNumbers(5,4,3,2,11);
        assertEquals(11,result);
    }

    @Test
    public void numberOfHighestFactorTest(){
        Kata katakata = new Kata();
       int result = katakata.numberOfHighestFactor(10);
        assertEquals(4, result);
    }
    @Test
    public void primeNumberTest(){
        Kata katakata = new Kata();
        boolean result = katakata.primeNumberTest(5);
        assertEquals(true, result);
    }


}
