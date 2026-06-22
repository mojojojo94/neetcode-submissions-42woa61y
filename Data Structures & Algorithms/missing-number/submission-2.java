class Solution {
    public int missingNumber(int[] nums) {
        int rangeSum = 0;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        for (int i = 0; i <= nums.length; i++) {
            rangeSum += i;
        }

        return rangeSum - actualSum;
    }
}
