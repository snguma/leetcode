package ke.co.stan.leetcode;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3,7,1,2,8,4,5};

        System.out.println(findMissing(nums));

    }

    // time complexity will be O(n)
    // space complexity will be O(1)
    private static int findMissing(int[] nums){
        // using the summation formula
        // calculate the expected_sum of the numbers
        int arraySize = nums.length;
        int expectedLen = arraySize+1;
        //n(n+1)/2
        int expectedSum = (expectedLen * (expectedLen + 1))/2;
        // calculate the actual_sum
        int actualSum = 0;
        for(int i: nums){
            actualSum = actualSum + i;
        }
        // do expected_sum - actual_sum
        return expectedSum - actualSum;
        // return the value
    }
}
