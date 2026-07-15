class Solution {
    public int maximumSum(int[] arr) {
        // Initialize our states with the first element
        int noDeletion = arr[0];
        int oneDeletion = arr[0];
        int maxOverall = arr[0];

        // Start from the second element
        for (int i = 1; i < arr.length; i++) {
            
            // For oneDeletion, we either:
            // 1. Keep a past deletion and add the current element (oneDeletion + arr[i])
            // 2. Delete the current element, keeping the previous noDeletion sum (noDeletion)
            oneDeletion = Math.max(oneDeletion + arr[i], noDeletion);

            // For noDeletion, it's standard Kadane's: 
            // Do we extend the previous subarray, or start a fresh one here?
            noDeletion = Math.max(noDeletion + arr[i], arr[i]);

            // Keep track of the highest sum we've seen in either state
            maxOverall = Math.max(maxOverall, Math.max(noDeletion, oneDeletion));
        }

        return maxOverall;
    }
}