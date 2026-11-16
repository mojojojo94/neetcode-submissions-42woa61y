class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complimentMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complimentIndex = complimentMap.get(nums[i]);
            if (complimentIndex != null) {
                return new int[]{complimentIndex, i};
            }
            complimentMap.put((target - nums[i]), i);
        }
        return nums;
    }
}
