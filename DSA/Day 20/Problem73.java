//16. Rotate Array Right
// Means Last Element Store Is Firstt

public class Problem73 {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40,50};
     int temp = arr[4];
     for(int i=arr.length-1; i>0; i--){
         arr[i] = arr[i-1];
     }
     arr[0] = temp;
     
     for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
     }
    }
}
