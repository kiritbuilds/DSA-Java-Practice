public class p5 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 50, 40};

        int largest = arr[0];
        int second = -1;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}