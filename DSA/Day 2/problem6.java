public class problem6 {
    public static void main(String[] args) {
        int[] arr = {85, 22, 19, 40, 95, 7};
        int min = arr[0];
        for (int num : arr) {
            if (min>num) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
