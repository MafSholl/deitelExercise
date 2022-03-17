package tddTests;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    /**public void main(String[] args){
        Account myAccount = new Account;

        System.out.printf("My account name is: %s%n%n", myAccount.getName());
    }**/
    @Test
    public void depositTest(){
        //given
        Account ericAccount = new Account ();
        //when
        ericAccount.deposit(100);
        //assert
        assertEquals(100,ericAccount.getBalance());
    }
    @Test
    public void depositTwiceTest(){
        Account ericAccount = new Account  ();
        ericAccount.deposit(100);
        ericAccount.deposit(400);
        assertEquals(500, ericAccount.getBalance());
    }
    @Test
    public void negativeDepositTest(){
        Account ericAccount = new Account();
        ericAccount.deposit(500);
        ericAccount.deposit(-500);
        assertEquals (500, ericAccount.getBalance());
    }



    @Test
    public void withdraw(){
        Account ericAccount = new Account ();
        ericAccount.deposit(500);
        ericAccount.withdraw(100);
        assertEquals(400,ericAccount.getBalance());
    }

    @Test
    public void withdrawPositive(){
        Account ericAccount = new Account();
        ericAccount.deposit(500);
        ericAccount.withdraw(+500);
        assertEquals(0, ericAccount.getBalance());
    }
    @Test
    public void withdrawNegative(){
        Account ericAccount = new Account ();
        ericAccount.deposit(500);
        ericAccount.withdraw(-500);
        assertEquals(0, ericAccount.getBalance());
    }

}
