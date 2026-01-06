public class problem1{
    public static void main(String[] args) {
        int[] arr = {10, 50, 25, 90, 12};
        int max = arr[0];
       for(int num : arr){
        if(num > max){
            max = num;
        }
       }
       System.out.println("Sabse bada number hai: " + max);
    }
}