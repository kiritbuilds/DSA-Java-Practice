// Check Sorted Array
public class Problem114 {
    static boolean isSorted(int[] arr, int index) {

        // 1) Base Case
        if(index == arr.length - 1)
            return true;

        // 2) Current > Next → Not Sorted
        if(arr[index] > arr[index + 1])
            return false;

        // 3) Recursion → check next index
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 14, 20, 28};

        System.out.println(isSorted(arr, 0));
    }
}