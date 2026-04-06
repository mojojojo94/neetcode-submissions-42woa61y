class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Pass 1: Calculate prefix products
        // output[i] will store the product of all elements to the left of index i
        output[0] = 1; 
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Pass 2: Calculate suffix products and multiply with current prefix products
        // suffixProduct stores the product of all elements to the right of index i
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return output;
    }
}  
