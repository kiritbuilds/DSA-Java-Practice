public class Problem18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // 1. Sabse aakhri number ko bacha lo (Jeb mein rakho)
        int last = arr[arr.length - 1]; // Value: 5

        // 2. Ulta Loop chalao (Piche se aage shift karo)
        // Hum 4th index se 1st index tak jayenge
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1]; // Pichla banda aage wali seat par baithega
        }
        
        // 3. Jo last number bachaya tha, usko sabse aage baitha do
        arr[0] = last;

        // 4. Print karo
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}