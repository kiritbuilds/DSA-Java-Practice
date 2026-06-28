// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// T(n) = O(n-1) = O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);
//     }
// }
// T(n) =  O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int evenCount = 0;
//         int oddCount = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2==0){
//                 evenCount++;
//             }else{
//                 oddCount++;
//             }
//         }
//         System.out.println( "Even Number Is a " + evenCount + " & " + "Odd Number is a " + oddCount);
// }
// }
// T(n) = O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         int min = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);
//     }
// }
// T(n) = O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         boolean isSorted = true;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>arr[i+1]){
//                 isSorted = false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("Sorted");
//         }else{
//             System.out.println("Not Sorted");
//         }
//     }
// }
// T(n) = O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {1,3,2,1,4,2,3};
//         for(int i=0; i<arr.length; i++){
//             boolean isDuplicate = false;
//             for(int j=0; j<i; j++){
//                 if(arr[i]==arr[j]){
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//                 if(!isDuplicate){
//                     System.out.print(arr[i] + " ");
//             }
//             }
//         }
// }
// T(n) = O(n) * O(n) = O(n^2) s(n) = AuxicilaryO(1)


// public class p6{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,5};
//         int n = 5;
//         int find = n*(n+1)/2;
//         int missing;
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }
//         missing = find - sum;
//         System.out.println(missing);
//     }
// }
// T(n) = O(n) s(n) = AuxicilaryO(1)

// public class p6{
//     public static void main(String[] args){
//         int[] arr = {0,1,0,3,12};
//         int target = 0;
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//                 arr[count] = arr[i];
//                 count++;
//             }
//         }
//         while (count < arr.length) {
//             arr[count] = target;
//             count++;
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// T(n) = O(n) + O(n) + O(n) = O(3n) = O(n) s(n) = AuxicilaryO(1)