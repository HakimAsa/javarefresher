package codechallenges.twosum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void returnArray0_1IfArrayIs3_3AndTargetIs6(){
        assertArrayEquals(new int []{0,1}, TwoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void returnArray0_1IfArrayIs2_7_11_15AndTargetIs9(){
        int [] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(new int []{0,1}, result);
    }

    @Test
    void returnsArray1_2IfArrayIs3_2_4AndTargetIs6(){
        int [] nums = {3,2,4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(new int []{1,2}, result);
    }@Test
    void returnsValidIndicesWithNegativeNumbersIfSolution() {
        // Test with negative numbers
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    void throwsAnExceptionIfNoSolution() {
        // Test when no solution exists
        int[] nums = {1, 2, 3};
        int target = 10;
        // Expecting exception
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
    @Test
    void throwsAnExceptionIfEmptyArray(){
        int [] nums = {};
        int target = 6;
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
    @Test
    void throwsAnExceptionIfSingleElementArray(){
        int [] nums = {6};
        int target = 6;
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }
}
