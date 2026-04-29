public class quickSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;

        System.out.println("Before Sorting : ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        quickSort(nums, 0, size-1);

         System.out.println();
         System.out.println("After Sorting : ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                //Swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Swapping
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
