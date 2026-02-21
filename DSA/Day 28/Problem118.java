// Arrays 
// 1. Find the largest element in an array

public class Problem118{
    public static void main(String[] args){
        int[] arr = {10,5,20,8};
        int max = arr[0];
        int i;
        for(i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element In Array Is A " + max);
    }
}