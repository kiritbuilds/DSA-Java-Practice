// Bubble Sort
public class Problem210 {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 2, 4, 5 };
        System.out.println("Before Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}