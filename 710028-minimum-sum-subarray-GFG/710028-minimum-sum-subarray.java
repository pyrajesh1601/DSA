class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int i = 0;
        int bestMin = a[0];
        int ans = a[0];
        
        for (i=1; i<a.length; i++){
            int v1 = bestMin + a[i];
            int v2 = a[i];
            bestMin = Math.min(v1,v2);
            ans = Math.min(bestMin, ans);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna