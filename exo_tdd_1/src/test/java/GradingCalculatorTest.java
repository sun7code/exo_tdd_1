// GradingCalculatorTest.java
import org.example.GradingCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradingCalculatorTest {

    @Test
    public void testScore95Attendance90_GivesGradeA() {
        GradingCalculator calculator = new GradingCalculator(95, 90);
        assertEquals('A', calculator.getGrade());
    }

    @Test
    public void testScore85Attendance90_GivesGradeB() {
        GradingCalculator calculator = new GradingCalculator(85, 90);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testScore65Attendance90_GivesGradeC() {
        GradingCalculator calculator = new GradingCalculator(65, 90);
        assertEquals('C', calculator.getGrade());
    }

    @Test
    public void testScore95Attendance65_GivesGradeB() {
        GradingCalculator calculator = new GradingCalculator(95, 65);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testScore95Attendance55_GivesGradeF() {
        GradingCalculator calculator = new GradingCalculator(95, 55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testScore65Attendance55_GivesGradeF() {
        GradingCalculator calculator = new GradingCalculator(65, 55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testScore50Attendance90_GivesGradeF() {
        GradingCalculator calculator = new GradingCalculator(50, 90);
        assertEquals('F', calculator.getGrade());
    }
}
