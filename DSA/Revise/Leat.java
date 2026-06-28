public class Leat {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
        int maxSum = Integer.MIN_VALUE;
        int sum = 8;
        for(int i=k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
        }
                System.out.println(maxSum);
}
}