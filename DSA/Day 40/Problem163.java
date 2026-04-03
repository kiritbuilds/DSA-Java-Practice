// public class Problem163{
//     public static void main(String[] args) {
        
//         int n = arr.length;
//         if (n <= 1 || k == 0) return;
        
//         // Trap se bachne ke liye
//         k = k % n; 
        
//         // Step 1: Shuru ke 'k' elements reverse karo (Index 0 se k-1)
//         reverse(arr, 0, k - 1);
        
//         // Step 2: Baaki ke bache elements reverse karo (Index k se n-1)
//         reverse(arr, k, n - 1);
        
//         // Step 3: Poora array reverse karo (Index 0 se n-1)
//         reverse(arr, 0, n - 1);
        
//         // 🛑 YAAD RAKHNA: Platform par yahan print nahi karna hai!
//     }

//     // Helper Method: Array ke kisi bhi hisse ko ulta karne ka jugaad
//     private void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }