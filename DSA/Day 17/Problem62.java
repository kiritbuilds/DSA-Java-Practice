public class Problem62{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        int i;
        for( i=0; i<arr.length; i++){
            sum = sum + arr[i];            
        }
        System.out.println("Sum Of Array Is A " + sum);
    }
}