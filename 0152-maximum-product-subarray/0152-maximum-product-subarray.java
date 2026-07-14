class Solution {
    public int maxProduct(int[] nums) {
        //Initializing the starting point
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int i = 0;
        int result = nums[0];

        for (i=1; i<nums.length; i++){
            int v1 = nums[i];
            int v2 = maxProduct * v1;
            int v3 = minProduct * v1;

            maxProduct = Math.max(v1, Math.max(v2,v3));
            minProduct = Math.min(v1, Math.min(v2,v3));

            result = Math.max(maxProduct, result);
        }
        return result;
    }
}