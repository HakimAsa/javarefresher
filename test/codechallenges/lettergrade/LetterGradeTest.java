package codechallenges.lettergrade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    @Test
    void throwsAnExceptionIfGradeIsLessThan0(){
        LetterGrade lg = new LetterGrade();
        assertThrows(IllegalArgumentException.class, () -> lg.determineLetterGrade(-1));
        assertThrows(IllegalArgumentException.class, () -> lg.determineLetterGrade(-100));
    }
    @Test
    void returnsFIfGradeIsLessThan60(){
        LetterGrade lg = new LetterGrade();
        assertEquals('F', lg.determineLetterGrade(59));
        assertEquals('F', lg.determineLetterGrade(0));
    }
    @Test
    void returnsDIfGradeIsLessThan70(){
        LetterGrade lg = new LetterGrade();
        assertEquals('D', lg.determineLetterGrade(60));
        assertEquals('D', lg.determineLetterGrade(69));
    }
    @Test
    void returnsCIfGradeIsLessThan80(){
        LetterGrade lg = new LetterGrade();
        assertEquals('C', lg.determineLetterGrade(70));
        assertEquals('C', lg.determineLetterGrade(79));
    }
    @Test
    void returnsBIfGradeIsLessThan90(){
        LetterGrade lg = new LetterGrade();
        assertEquals('B', lg.determineLetterGrade(80));
        assertEquals('B', lg.determineLetterGrade(89));
    }
    @Test
    void returnsAIfGradeIsGreaterThan90(){
        LetterGrade lg = new LetterGrade();
        assertEquals('A', lg.determineLetterGrade(91));
        assertEquals('A', lg.determineLetterGrade(100));
    }
}