//Count even and odd Numbers

public class Problem122 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Total Even Count Is A " + evenCount);
        System.out.println("Total Odd Count Is A " + oddCount);

    }
}
