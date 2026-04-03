class Solution {
    public boolean hasDuplicate(int[] nums) {
        int arraySize = nums.length;
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());

        if (set.size() < arraySize) {
            return true;
        }

        return false;

        
    }
}