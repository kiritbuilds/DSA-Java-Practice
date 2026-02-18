//Print array Recursively

public class Problem111 {
    static void printArray(int[] arr, int index){
        if(index == arr.length){
         return;   // base case
        }    
        System.out.println(arr[index]);   // work

        printArray(arr, index + 1);       // recursive call
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);
    }
}
