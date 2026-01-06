public class problem3 {
    public static void main(String[] args) {
        int[] arr= {2, 5, 2, 9, 2, 8, 2};
        int target = 2;
        int count = 0;
        for (int num : arr) {
            if(num == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
