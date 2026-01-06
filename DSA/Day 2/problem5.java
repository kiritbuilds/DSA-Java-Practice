public class problem5 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 9, 24, 8};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num%2 == 0 ) {
                System.out.println("It Is Even");
                evenCount++;
            }else{
                System.out.println("It IS Odd");
                oddCount++;
            }
        }
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
