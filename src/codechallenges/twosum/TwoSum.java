package codechallenges.twosum;

import java.util.Arrays;

class TwoSum {
    /**
     * @param nums    contains the integer
     * @param target: the goal
     * @return indices
     */
    public static int[] twoSum(int[] nums, int target){
        if(nums == null || nums.length < 2)
            throw new IllegalArgumentException("Input array is too small or null");

        int [] indices = new int[2];
        for (int first = 0; first < nums.length; first++)
            for(int second = first + 1; second < nums.length; second++)
                if(nums[first] + nums[second] == target){
                    indices[0]= first;
                    indices[1]= second;
                    return indices; //return immediately the solution if matched
                }
        throw new IllegalArgumentException("No two sum solution");
    }

    //todo think of a more efficient way to reduce time complexity of the first implementation
    public static int[] twoSumOptimized (int nums, int target){
        return new int[]{0};
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int target = 6;
        int [] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, target)));
        long end = System.currentTimeMillis();

        System.out.println("Elapsed Time in milliseconds is: " +(end - start));
    }
}
