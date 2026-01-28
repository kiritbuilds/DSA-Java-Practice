//14. Remove Duplicates
public class Problem71 {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 40, 40 };

        int[] unique = new int[arr.length];

        int j = 0;

        // Step 1: First element always unique
        unique[j++] = arr[0];

        // Step 2: Move through array
        for (int i = 1; i < arr.length; i++) {

            // compare with previous element (sorted array)
            if (arr[i] != arr[i - 1]) {
                unique[j++] = arr[i];
            }
        }

        System.out.print("After removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
