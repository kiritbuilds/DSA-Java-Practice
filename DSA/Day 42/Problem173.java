// Q17. Find majority element (>n/2 times)
// Input: arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output: 4
// Difficulty: 
// Companies: e-Infochips, Wipro
// Hint: Boyer-Moore Voting Algorithm

public class Problem173 {
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1; // khud ko include karo

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}