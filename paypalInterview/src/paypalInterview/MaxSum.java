package paypalInterview;

public class MaxSum {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0] > 0 ? nums[0] : 0;
        
        for (int i = 1; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        
        return maxSum;
        
    }
}
