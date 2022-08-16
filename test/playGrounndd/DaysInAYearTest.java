package playGrounndd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysInAYearTest {

    @Test void daysInAYearExistTest(){
        DaysInAYear daysInAYear = new DaysInAYear();
        assertNotNull(daysInAYear);
    }
    @Test void yearSolutionWorks() {
        DaysInAYear daysInAYear = new DaysInAYear();
        int year = daysInAYear.yearCalculator(360);
        assertEquals(1, year);
    }

    @Test void monthSolutionWorks() {
        DaysInAYear daysInAYear = new DaysInAYear();
        int month = daysInAYear.monthCalculator(390);
        assertEquals(1, month);
    }

    @Test void daySolutionWorks() {
        DaysInAYear daysInAYear = new DaysInAYear();
        int days = daysInAYear.dayCalculator(391);
        assertEquals(1, days);
    }
}