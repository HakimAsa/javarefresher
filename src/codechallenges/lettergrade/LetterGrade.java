package codechallenges.lettergrade;

public class LetterGrade {
    public char determineLetterGrade(int grade){
        if(grade < 0)
            throw new IllegalArgumentException("Grade cannot be negative");
        if (grade < 60)
            return 'F';
        if(grade < 70)
            return 'D';
        if(grade < 80)
            return 'C';
        if(grade < 90)
            return 'B';
        return 'A';
    }
}
