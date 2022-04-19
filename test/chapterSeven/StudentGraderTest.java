package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentGraderTest {
    private StudentGrader grader;
    @BeforeEach
    public void anythingGoes(){
        grader = new StudentGrader();
    }

    @Test
    public void studentGraderExist(){
        assertNotNull(grader);
    }

    @Test
    public void studentGraderCanInitializeArray(){
        grader.arrayInitializer(3,3);
        assertEquals(3, grader.getStudentGraderArrayLength());
    }

    @Test
    public void studentGraderArrayIsEmpty(){
        grader.arrayInitializer(3,3);
        assertNotNull(grader);
        assertEquals(0, grader.getStudentGraderElement(0,0));
        assertEquals(0, grader.getStudentGraderElement(0,1));
        assertEquals(0, grader.getStudentGraderElement(0,2));
        assertEquals(0, grader.getStudentGraderElement(1,0));
        assertEquals(0, grader.getStudentGraderElement(1,1));
        assertEquals(0, grader.getStudentGraderElement(1,2));
        assertEquals(0, grader.getStudentGraderElement(2,0));
        assertEquals(0, grader.getStudentGraderElement(2,1));
        assertEquals(0, grader.getStudentGraderElement(2,2));
    }

    @Test
    public void studentGradesArrayCanBeLoadedTest(){
        grader.arrayInitializer(2,2);
        assertEquals(0, grader.getStudentGraderElement(0,0));
        grader.studentGradeArrayLoader(0,0, 13);
        assertEquals(13,grader.getStudentGraderElement(0,0));
    }

    @Test
    public void studentGradesCanBeLoadedMultipleTimesTest(){
        grader.arrayInitializer(2,2);
        assertEquals(0, grader.getStudentGraderElement(0,0));
        assertEquals(0, grader.getStudentGraderElement(0,1));
        assertEquals(0, grader.getStudentGraderElement(1,0));
        assertEquals(0, grader.getStudentGraderElement(1,1));
        grader.studentGradeArrayLoader(0,0,10);
        grader.studentGradeArrayLoader(0,1,15);
        grader.studentGradeArrayLoader(1,0,20);
        grader.studentGradeArrayLoader(1,1,30);
        assertEquals(10, grader.getStudentGraderElement(0,0));
        assertEquals(15, grader.getStudentGraderElement(0,1));
        assertEquals(20, grader.getStudentGraderElement(1,0));
        assertEquals(30, grader.getStudentGraderElement(1,1));
    }
}
