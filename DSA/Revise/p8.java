// public class p8 {
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 45, 6, 10, -8};
//         int sum = 16;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]+arr[j]==sum){
//                     System.out.println( "(" + arr[i] + "," + arr[j] + ")");
//                 }
//             }
//         }
//     }
// }

// public class p8{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int k = 2;
//         for(int j=0; j<k; j++){
//             int first = arr[0];
//             for(int i=0; i<arr.length-1; i++){
//                 arr[i] = arr[i+1];
//             }
//             arr[arr.length-1] = first;
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// public class p8{
//     public static void main(String[] args){

//         int[] arr = {3,3,4,2,4,4,2,4,4};

//         for(int i=0; i<arr.length; i++){

//             int count = 0;

//             for(int j=0; j<arr.length; j++){

//                 if(arr[i] == arr[j]){
//                     count++;
//                 }

//             }

//             if(count > arr.length/2){
//                 System.out.println("Majority Element: " + arr[i]);
//                 return;
//             }

//         }

//         System.out.println("No Majority Element");
//     }
// }

public class p8{

    public static void main(String[] args){

        int[] arr = {16,17,4,3,5,2};

        for(int i=0; i<arr.length; i++){

            boolean leader = true;

            for(int j=i+1; j<arr.length; j++){

                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }

            }

            if(leader){
                System.out.print(arr[i] + " ");
            }

        }

    }
}