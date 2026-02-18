// Find the Second Largest element

public class Problem119{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int largest = arr[0];
        int second = -1;
        int i;
        for(i=1; i<arr.length; i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println("Second Largest Element Is A "+ second);
    }
}