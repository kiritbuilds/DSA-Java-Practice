public class problem13 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0; // Ye pointer track karega ki agla non-zero kahan aana chahiye

        // STEP 1: Saare NON-ZERO numbers ko aage shift karo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i]; // Number ko aage laao
                count++; // Agli jagah tayyar karo
            }
        }

        // STEP 2: Ab count ke baad jitni jagah bachi hai, wahan 0 bhar do
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

        // Output Print karke dekho
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}