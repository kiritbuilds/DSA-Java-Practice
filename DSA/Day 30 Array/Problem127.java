//1. Find Largest Element in an array

public class Problem127{
    public static void main(String[] args) {
        int[] arr = {10,5,20,8};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element Is A " + max);
    }
}