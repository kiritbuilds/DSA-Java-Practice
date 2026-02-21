// 5. Count Even Odd Numbers

public class Problem131 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int[] arr = {2,3,4,5,6};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Count Is A " + evenCount);
        System.out.println("Odd Count Is A " + oddCount);
    }
}
