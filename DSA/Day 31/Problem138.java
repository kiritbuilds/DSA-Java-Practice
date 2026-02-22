// 12.Binary Search

public class Problem138 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int left = 0;
        int right = arr.length - 1;
        int middle;
        int target = 10;
        boolean found = false;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == target) {
                found = true;
                System.out.println("found at Index " + middle);
                break;
            } else if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (found == false) {
            System.out.println("Target not found in array");
        }
    }
}
