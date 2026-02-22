// Q8. Remove duplicates from sorted array

public class Problem134{
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int[] unique = new int[arr.length];
        int j=0;
        unique[j++] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                unique[j++]=arr[i];             
            }
        }
        System.out.println("After Removing Duplicates");
        for(int i=0; i<j; i++){
            System.out.print(unique[i] + " ");
        }
    }
}