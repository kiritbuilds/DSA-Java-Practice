// Linear Search
// public class p7 {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         int target = 30;
//         int i;
//         boolean isFound = false;
//         for(i=0; i<arr.length; i++){
//             if(arr[i]==target){
//                 isFound = true;
//                 break;
//             }
//         }
//          if(isFound){
//              System.out.println("Index" + i);   
//             }else{
//                 System.out.println("Not Found");
//             }
//     }
// }
// T(n) = O(n) s(n) = auxicilary O(1)

// Q13. Count occurrences of element

// public class p7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,2,2,3,3,4};
//         int target = 2;
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==target){
//                 count++;
//             }
//         }
//         System.out.println("Target Occurences is A " + count);
//     }
// }

// Q14. Find first repeating element
public class p7{
    public static void main(String[] args){

        int[] arr = {10,5,3,4,3,5,6};

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println("First Repeating Element: " + arr[i]);
                    return;
                }

            }

        }

        System.out.println("No Repeating Element");
    }
}