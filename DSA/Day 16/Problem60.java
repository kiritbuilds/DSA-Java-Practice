public class Problem60 {
    public static void main(String[] args) {
        // Size Of Array
        int[] arr = {10,20,30,40,50};
        int max = arr[0];
        int i ;
        for(i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Elements Of This Array Is A " + max);
    }
}
