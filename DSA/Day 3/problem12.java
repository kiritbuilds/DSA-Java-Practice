public class problem12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true; // Maan lo hai

        while (start < end) {
            if (start==end) {
                start++;
                end--;
            }else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("True ");
        } else {
            System.out.println("False ");
        }
    }
}