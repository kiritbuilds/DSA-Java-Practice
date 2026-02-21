// 4. Find Sum of all elements

public class Problem130 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum Of All Element Is A " + sum);
    }
}
