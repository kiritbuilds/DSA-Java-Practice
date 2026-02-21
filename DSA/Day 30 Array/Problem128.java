//2. Find The Second Largest Element In Array

public class Problem128 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = arr[0];
        int second = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println("Largest Element Is A " + largest);
        System.out.println("Second Largest Element Is A " + second);
    }
}
