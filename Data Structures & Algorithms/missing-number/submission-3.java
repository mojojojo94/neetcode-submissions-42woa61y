class Solution {
    public int missingNumber(int[] nums) {
        int rangeSum = (nums.length * (nums.length + 1))/2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return rangeSum - actualSum;
    }
}
