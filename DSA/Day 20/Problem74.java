//17. Count Frequency
// Means Kyo Number Ketli Var aavyo

public class Problem74 {
    public static void main(String[] args) {

        int[] arr = { 10, 10, 20, 20, 20, 30 };

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; // same element → frequency increase
            } else {
                // new element start → pehle wale ki frequency print
                System.out.println(arr[i - 1] + " appears " + count + " times");
                count = 1; // reset for new number
            }
        }

        // last element ki frequency print
        System.out.println(arr[arr.length - 1] + " appears " + count + " times");
    }
}
