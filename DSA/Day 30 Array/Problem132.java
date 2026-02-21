// 6. Find Minimum Element

public class Problem132 {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element Is A " + min);
    }
}
