class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Space: O(n) to store seen numbers
        HashMap<Integer, Integer> seen = new HashMap<>();

        // Time: O(n) - Single pass through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If we've already seen the number we need, we're done!
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            // Otherwise, remember this number and its index for later
            seen.put(nums[i], i);
        }
        
        return new int[] {}; 
    }
}
