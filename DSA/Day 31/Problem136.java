// Q10. Move all zeros to end

public class Problem136 {
    public static void main(String[] args) {
     int[] arr = {0, 1, 0, 3, 12};
     int target = 0;
     int count = 0;
     for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
            arr[count] = arr[i];
            count++;
        }
     }
     // Uper Ni loop Patya Pachi array {1,3,12,_,_}
     while (count < arr.length){
        arr[count] = target;
        count++;
     }
     // Uper ni loop Patya Pachi Array {1,3,12,0,0};
     for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
     }
 }
}