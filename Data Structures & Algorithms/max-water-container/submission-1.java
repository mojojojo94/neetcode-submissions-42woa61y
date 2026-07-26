class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int aPointer = 0;
        int bPointer = heights.length - 1;

        while (aPointer < bPointer) {
            if (heights[aPointer] < heights[bPointer]) {
                maxArea = Math.max(maxArea, heights[aPointer] * (bPointer - aPointer));
                aPointer++;
            } else {
                maxArea = Math.max(maxArea, heights[bPointer] * (bPointer - aPointer));
                bPointer--;
            }
        }

        return maxArea;
        
    }
}
