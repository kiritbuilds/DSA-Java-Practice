// 10. Check array sorted or not 

public class Problem67 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int i;
        boolean sorted = true;
        for(i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array Is Sorted");
        }else{
            System.out.println("Array Is Not Sorted");
        }
    }
}
