package playGrounndd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtmCardValidatorTest {

    private AtmCardValidator atmCardValidator;

    @BeforeEach
    public void setUp(){
        atmCardValidator = new AtmCardValidator();
    }

    @Test
    public void AtmValidatorExist(){
        assertNotNull(atmCardValidator);
    }

    @Test
    public void userDebitCardNumberInputMethodWorks(){
        atmCardValidator.cardNumberInputPrompt("123456789012345");
        assertEquals("123456789012345", atmCardValidator.getCardNumber());
    }

    @Test
    public void userDebitCardNumber_IsNotLessThanThirteenTest(){
        atmCardValidator.cardNumberInputPrompt("123456789012");
        assertFalse(atmCardValidator.isCardValid());
    }

    @Test
    public void userDebitCardNumber_IsNotMoreThanFifteenTest(){
        atmCardValidator.cardNumberInputPrompt("1234567890123456");
        assertFalse(atmCardValidator.isCardValid());
    }

    @Test
    public void shorterOrLongerCardNumberThrowsError(){
        atmCardValidator.cardNumberInputPrompt("1234567890123456");
        assertFalse(atmCardValidator.isCardValid());
        assertThrows(IllegalArgumentException.class, ()->atmCardValidator.cardValidator());
        atmCardValidator.cardNumberInputPrompt("123456789012");
        assertFalse(atmCardValidator.isCardValid());
        assertThrows(IllegalArgumentException.class, ()->atmCardValidator.cardValidator());
    }

    @Test
    public void cardNumberValidatorMethodWorksTest(){
        atmCardValidator.cardNumberInputPrompt("123456789012345");
        atmCardValidator.cardValidator();
        assertTrue(atmCardValidator.isCardValid());
    }

//    @Test

    @Test public void oddPositionedNumberCanBeAddedUPTest(){
        atmCardValidator.cardNumberInputPrompt("11111111111111");
        atmCardValidator.cardValidator();
        atmCardValidator.oddPositionedNumberSum();
        assertEquals(14, atmCardValidator.getOddPositionSum());
    }

    @Test public void productOfOddPositionedNumbers_WhenGreaterThanTenAreAddedTest(){
        atmCardValidator.cardNumberInputPrompt("66666666666666");
        atmCardValidator.cardValidator();
        atmCardValidator.oddPositionedNumberSum();
        assertEquals(21, atmCardValidator.getOddPositionSum());
    }

    @Test public void evenPositionedNumberCanBeAddedUPTest(){
        atmCardValidator.cardNumberInputPrompt("11111111111111");
        atmCardValidator.cardValidator();
        atmCardValidator.evenPositionedNumberSum();
        assertEquals(14, atmCardValidator.getEvenPositionSum());
    }

    @Test public void productOfEvenPositionedNumbers_WhenGreaterThanTenAreAddedTest(){
        atmCardValidator.cardNumberInputPrompt("66666666666666");
        atmCardValidator.cardValidator();
        atmCardValidator.evenPositionedNumberSum();
        assertEquals(21, atmCardValidator.getEvenPositionSum());
    }

    @Test public void productOfNumbersIsCorrect_IfCardNumbersAreAMix(){
        atmCardValidator.cardNumberInputPrompt("15511551155115");
        atmCardValidator.evenPositionedNumberSum();
        assertEquals(10, atmCardValidator.getEvenPositionSum());
        atmCardValidator.oddPositionedNumberSum();
        assertEquals(11, atmCardValidator.getOddPositionSum());
    }
}
