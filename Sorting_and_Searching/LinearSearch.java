public class LinearSearch{
    public static void main(String[] args) {
        int nums[] = {1,3,2,98,5,7,9,11,13};
        int target = 13;

        int result1 = binarySearch(nums, target, 0, nums.length - 1);
        int result2 = linearSearch(nums, target);
        if (result1 != -1) {
            System.out.println("Element found at index : " +  result1);
        }
        else
            System.out.println("Element not found");
      
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0; i<nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by LS: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by LS: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        //Normal Approach For Binary Search

        // int steps = 0;
        // int left = 0;
        // int right = nums.length - 1;

        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     steps++;

        //     if (nums[mid] == target) {
        //         System.out.println("Steps taken by BS: " + steps);
        //         return mid;
        //     }
        //     else if (nums[mid] < target) {
        //         left = mid + 1;
        //     }
        //     else {
        //         right = mid - 1;
        //     }
        // }
        // System.out.println("Steps taken by BS: " + steps);
        // return -1;

        //Recursive Approach For Binary Search
        
         if(left <= right){
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                else if (nums[mid] < target) {
                    return binarySearch(nums, target, mid + 1, right);
                }
                else {
                    return binarySearch(nums, target, left, mid - 1);
                }
            }
            return -1;
    }
}