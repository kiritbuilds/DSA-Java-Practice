//Find max In Array

public class Problem112 {

    static int findMax(int[] arr, int index) {

        // Base case: last element
        if(index == arr.length - 1)
            return arr[index];

        // Recursive: max of rest
        int maxOfRest = findMax(arr, index + 1);

        // Compare current vs rest
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 40};

        System.out.println(findMax(arr, 0));  // Output: 80
    }
}        
