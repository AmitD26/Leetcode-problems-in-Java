package paypalInterview;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = null;
    
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                ans = new int[] { map.get(temp), i };
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}

