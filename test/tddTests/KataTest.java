package tddTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
    public void evenNumbers(){
        int number = 1;
        while (number <= 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
    }
}
