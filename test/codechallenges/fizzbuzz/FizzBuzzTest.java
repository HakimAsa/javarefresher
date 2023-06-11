package codechallenges.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfNumberIsDivisibleByThreeOnly(){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }
    @Test
    void shouldReturnBuzzIfNumberIsDivisibleByFiveOnly(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
    @Test
    void shouldReturnFizzBuzzIfNumberIsDivisibleByThreeAndFive(){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
    @Test
    void shouldReturnPassedNumberIfItIsNotDivisibleByThreeAndFive(){
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}