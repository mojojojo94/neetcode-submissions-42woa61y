class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complimentMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(complimentMap.containsKey(nums[i])) {
                return new int[]{complimentMap.get(nums[i]), i};
            }
            complimentMap.put((target - nums[i]), i);
        }
        return nums;
    }
}
