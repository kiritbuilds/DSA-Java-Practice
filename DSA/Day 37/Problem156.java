// Find Majority Elements

public class Problem156{
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int count = 0;
        for(int j=0; j<n; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > n/2){
            System.out.println("Majority Element Is A " + arr[i]);
            return;
        }
        }
        System.out.println("No Maority Element Is Found ");
    }
}