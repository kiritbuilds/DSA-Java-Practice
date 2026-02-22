// Q9. Find missing number (1 to N)

public class Problem135{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int sum = 0;
        int expectedSum;
        int missing ;
        int n = arr.length+1;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        expectedSum = (n*(n+1))/2;
        missing = expectedSum - sum;
        System.out.println("Missing Number Is A " + missing);
    }
}