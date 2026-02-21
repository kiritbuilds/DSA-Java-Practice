// 7. Check if Array is Sorted

public class Problem133 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean Sorted = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                Sorted = false;
            }
        }
        if(Sorted){
            System.out.println("Array Is Sorted");
        }else{
            System.out.println("Array Is Not Sorted");
        }
    }
}
