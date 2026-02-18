//Find Sum Of All Elements

public class Problem121 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum Of All Element Is A " + sum);
    }
}
