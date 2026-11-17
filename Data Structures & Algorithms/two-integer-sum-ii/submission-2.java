class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int right = numbers.length - 1;
        int left = 0;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            } else {
                return new int[]{left+1, right+1};
            } 
        }

        return numbers;
        
    }
}
