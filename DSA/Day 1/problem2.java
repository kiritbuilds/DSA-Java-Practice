public class problem2 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int target = 9;
        boolean isFound = false;
        for (int num : arr) {
            if(num == target){
                System.out.println("found");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not Found");
        }
    }
}
