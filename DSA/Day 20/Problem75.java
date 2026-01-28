//18.  Missing Number

public class Problem75{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int sum = 0;
        int total = n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int missing_number = total - sum ;
        System.out.println("Missing Number Is " + missing_number);
    }
}