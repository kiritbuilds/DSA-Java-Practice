// 13. Count occurences of element 

public class Problem139 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                count++;
            }
        }
        System.out.println("Element 2 Occurences Is a " + count);
    }
}
