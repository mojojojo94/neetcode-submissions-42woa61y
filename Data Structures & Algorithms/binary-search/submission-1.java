class Solution {
    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            int middlePosition = head + (tail - head) / 2;

            if (target == nums[middlePosition]) {
                return middlePosition;
            } else if (nums[middlePosition] < target) {
                head = middlePosition + 1;
            } else {
                tail = middlePosition - 1;
            }
        }
        return -1;     
    }
}
