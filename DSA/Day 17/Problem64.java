public class Problem64 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,3};
        int i;
        int evenCount = 0;
        int oddCount = 0;
        for(i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total Even Number Is " + evenCount);
        System.out.println("Total odd Number Is " + oddCount);
    }
}
